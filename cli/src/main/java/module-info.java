import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.gitlab.cli.GitLabCommandFactory;
import org.nasdanika.models.gitlab.cli.GitLabContributorCommandFactory;
import org.nasdanika.models.gitlab.cli.GitLabRetrospectCommandFactory;

module org.nasdanika.models.gitlab.cli {
	
	exports org.nasdanika.models.gitlab.cli;
	
	requires transitive org.nasdanika.cli;
	requires transitive org.nasdanika.models.gitlab;
	
	opens org.nasdanika.models.gitlab.cli to info.picocli;
	
	provides CapabilityFactory with 
		GitLabCommandFactory,
		GitLabContributorCommandFactory,
		GitLabRetrospectCommandFactory;

}
