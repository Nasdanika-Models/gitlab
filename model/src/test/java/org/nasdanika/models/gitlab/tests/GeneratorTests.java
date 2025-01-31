package org.nasdanika.models.gitlab.tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.ServiceCapabilityFactory.Requirement;
import org.nasdanika.capability.emf.ResourceSetRequirement;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.ncore.NcoreFactory;
import org.nasdanika.ncore.Period;
import org.yaml.snakeyaml.Yaml;

/**
 * Helper code generation tests
 */
public class GeneratorTests {
	
	private static final String DECLARATIONS = """
baseSha : String
headSha : String
height : Integer
newLine : Integer
newPath : String
oldLine : Integer
oldPath : String
positionType : PositionType
startSha : String
width : Integer
x : Double
y : Double
			""";
	
	private static final String TEMPLATE = """
			    <eStructuralFeatures xsi:type="ecore:EAttribute" name="${name}" eType="${type}"/>			
			""";
	
	private static final Map<String, String> TYPE_MAP = Map.ofEntries(
			Map.entry("Boolean", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EBooleanObject"),
			Map.entry("Integer", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EIntegerObject"),
			Map.entry("Long", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//ELongObject"),
			Map.entry("Double", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EDoubleObject"),
			Map.entry("Date", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EDate"),
			Map.entry("String", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString")
			);	
	
	@Test
	public void testGenerateAttributes() {
		Yaml yaml = new Yaml();
		Map<String,String> declarations = yaml.load(DECLARATIONS);
		for (Entry<String, String> declaration: declarations.entrySet()) {			
			String type = TYPE_MAP.get(declaration.getValue());
			if (type == null) {
				type = "#//" + declaration.getValue();
			}
			Function<String, String> tokens = Map.of(
					"name",
					declaration.getKey(),
					"type",
					type)::get;
			System.out.print(Util.interpolate(TEMPLATE, tokens));			
		}
	}
	
	@Test 
	public void testSaveDuration() throws IOException {
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);

		Period period = NcoreFactory.eINSTANCE.createPeriod();
		period.setDuration(Duration.ofDays(20));
		
		URI xmiURI = URI.createFileURI(new File("target/period.xml").getAbsolutePath());
		Resource xmiResource = resourceSet.createResource(xmiURI);
		xmiResource.getContents().add(period);
		xmiResource.save(null);				
	}
	
	@Test
	@Disabled
	public void testLoadDuration() throws IOException {
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
		
		URI xmiURI = URI.createFileURI(new File("target/period.xml").getAbsolutePath());
		Resource xmiResource = resourceSet.getResource(xmiURI, true);
		Period period = (Period) xmiResource.getContents().get(0);
		System.out.println(period.getDuration());
	}

}
