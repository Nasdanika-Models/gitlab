package org.nasdanika.models.gitlab.util;

import org.gitlab4j.api.GitLabApi;
import org.gitlab4j.api.GitLabApiException;

public interface GitLabApiFunction<T> {
	
	T apply(GitLabApi gitLabApi) throws GitLabApiException;

}
