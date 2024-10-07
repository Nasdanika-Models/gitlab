package org.nasdanika.models.gitlab.cli;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.cli.SubCommandCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;

import picocli.CommandLine;

public class GitLabContributorCommandFactory extends SubCommandCapabilityFactory<GitLabContributorCommand> {

	@Override
	protected Class<GitLabContributorCommand> getCommandType() {
		return GitLabContributorCommand.class;
	}
	
	@Override
	protected CompletionStage<GitLabContributorCommand> doCreateCommand(
			List<CommandLine> parentPath,
			CapabilityFactory.Loader loader,
			ProgressMonitor progressMonitor) {
		return CompletableFuture.completedStage(new GitLabContributorCommand(loader.getCapabilityLoader()));
	}

}
