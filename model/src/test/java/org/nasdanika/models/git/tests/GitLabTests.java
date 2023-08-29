package org.nasdanika.models.git.tests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.gitlab.GitLab;
import org.nasdanika.models.gitlab.util.Loader;

public class GitLabTests {
		
	@Test
//	@Disabled
	public void testLoad() throws Exception {
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		try (Loader loader = new Loader("https://gitlab.com/", System.getenv("GITLAB_ACCESS_TOKEN"))) {
			ExecutorService threadPool = Executors.newFixedThreadPool(10);
			loader.setExecutor(threadPool);
			GitLab gitLab = loader.loadGroups(progressMonitor);			
			ResourceSet gitLabResourceSet = new ResourceSetImpl();
			gitLabResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

			Factory binaryResourceFactory = new Resource.Factory() {

				@Override
				public Resource createResource(URI uri) {
					return new BinaryResourceImpl(uri) {
						
						@Override
						protected void doSave(java.io.OutputStream outputStream, java.util.Map<?,?> options) throws IOException {
							try (java.io.OutputStream gzOut = new GZIPOutputStream(outputStream)) {
								super.doSave(gzOut, options);
							}
						}
						
						@Override
						protected void doLoad(java.io.InputStream inputStream, java.util.Map<?,?> options) throws IOException {
							try (java.io.InputStream gzIn = new GZIPInputStream(inputStream)) {
								super.doLoad(gzIn, options);
							}						
						}
						
						@Override
						public EObject getEObject(String uriFragment) {
							return super.getEObject(uriFragment);
						};
																
					};
				}
				
			};
			
			// Testing binary resource
			gitLabResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("gz", binaryResourceFactory);		
			
			File modelsDir = new File("target\\models\\");
			modelsDir.mkdirs();
			
			File output = new File(modelsDir, "gitLab.xmi");
			Resource gitLabResource = gitLabResourceSet.createResource(URI.createFileURI(output.getAbsolutePath()));
			gitLabResource.getContents().add(gitLab);
			gitLabResource.save(null);
			threadPool.shutdown();
		}
	}

}
