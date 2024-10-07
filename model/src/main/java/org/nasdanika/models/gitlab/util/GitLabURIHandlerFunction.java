package org.nasdanika.models.gitlab.util;

import java.io.IOException;

public interface GitLabURIHandlerFunction<T> {
	
	T apply(GitLabURIHandler gitLabURIHandler) throws IOException;

}
