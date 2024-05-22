package org.nasdanika.models.gitlab.codeowners.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.capability.emf.EPackageCapabilityFactory;
import org.nasdanika.models.gitlab.codeowners.CodeownersPackage;

public class CodeownersEPackageResourceSetCapabilityFactory extends EPackageCapabilityFactory {

	@Override
	protected EPackage getEPackage() {
		return CodeownersPackage.eINSTANCE;
	}

	@Override
	protected URI getDocumentationURI() {
		return URI.createURI("https://gitlab.models.nasdanika.org/references/eSubpackages/codeowners/");
	}

}
