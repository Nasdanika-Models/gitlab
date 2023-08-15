module org.nasdanika.models.gitlab {
	exports org.nasdanika.models.gitlab;
	exports org.nasdanika.models.gitlab.impl;
	exports org.nasdanika.models.gitlab.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.gitlab4j.api;
}