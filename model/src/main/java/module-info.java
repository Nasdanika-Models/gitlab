import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.gitlab.codeowners.util.CodeownersEPackageResourceSetCapabilityFactory;
import org.nasdanika.models.gitlab.util.GitLabEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.gitlab {
	exports org.nasdanika.models.gitlab;
	exports org.nasdanika.models.gitlab.impl;
	exports org.nasdanika.models.gitlab.util;
	exports org.nasdanika.models.gitlab.codeowners;
	exports org.nasdanika.models.gitlab.codeowners.impl;
	exports org.nasdanika.models.gitlab.codeowners.util;
	exports org.nasdanika.models.gitlab.pipeline;
	exports org.nasdanika.models.gitlab.pipeline.impl;
	exports org.nasdanika.models.gitlab.pipeline.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive gitlab4j.api;
	requires transitive java.logging;
	requires transitive org.nasdanika.emf;
	requires transitive org.nasdanika.models.coverage;
	requires org.eclipse.emf.ecore.xmi;
	requires org.nasdanika.common;	
	
	provides CapabilityFactory with
		GitLabEPackageResourceSetCapabilityFactory,
		CodeownersEPackageResourceSetCapabilityFactory;
	
}