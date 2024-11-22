package org.nasdanika.models.gitlab.cli;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.cli.SubCommandCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;

import picocli.CommandLine;

public class GitLabRetrospectCommandFactory extends SubCommandCapabilityFactory<GitLabRetrospectCommand> {

	@Override
	protected Class<GitLabRetrospectCommand> getCommandType() {
		return GitLabRetrospectCommand.class;
	}
	
	@Override
	protected CompletionStage<GitLabRetrospectCommand> doCreateCommand(
			List<CommandLine> parentPath,
			CapabilityFactory.Loader loader,
			ProgressMonitor progressMonitor) {
		return CompletableFuture.completedStage(new GitLabRetrospectCommand(loader.getCapabilityLoader()));
	}

}
