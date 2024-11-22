package org.nasdanika.models.gitlab.cli;

import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.cli.CommandGroup;
import org.nasdanika.cli.ParentCommands;

import picocli.CommandLine.Command;
import picocli.CommandLine.ParentCommand;

@Command(
		description = {
				"Parent for sub-command contributing",
				"based on the history since a specified commit",
				"or date/time"
		},
		name = "retrospect",
		mixinStandardHelpOptions = true)
@ParentCommands(GitLabContributorCommand.class)
public class GitLabRetrospectCommand extends CommandGroup {
	
	public GitLabRetrospectCommand() {
		super();
	}

	public GitLabRetrospectCommand(CapabilityLoader capabilityLoader) {
		super(capabilityLoader);
	}
	
	@ParentCommand
	private GitLabContributorCommand parent;

}
