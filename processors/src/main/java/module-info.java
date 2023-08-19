module org.nasdanika.models.gitlab.processors {
		
	requires transitive org.nasdanika.models.gitlab;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.gitlab.processors;
	opens org.nasdanika.models.gitlab.processors; // For loading resources
	
}
