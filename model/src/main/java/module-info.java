import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.gitlab.codeowners.util.CodeownersEPackageResourceSetCapabilityFactory;
import org.nasdanika.models.gitlab.util.GitLabEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.gitlab {
	exports org.nasdanika.models.gitlab;
	exports org.nasdanika.models.gitlab.impl;
	exports org.nasdanika.models.gitlab.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.gitlab4j.api;
	requires transitive java.logging;
	requires transitive org.nasdanika.ncore;
	requires org.eclipse.emf.ecore.xmi;	
	
	provides CapabilityFactory with
		GitLabEPackageResourceSetCapabilityFactory,
		CodeownersEPackageResourceSetCapabilityFactory;
	
}