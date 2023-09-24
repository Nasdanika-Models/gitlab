# GitLab
GitLab model - users, groups, projects, repositories, branches, commits, ... 
Can be used for loading and storing GitLab objects for cross-referencing with other objects in the enterprise (e.g. people in the org hierarchy) and analysis.

Uses [gitlab4j](https://github.com/gitlab4j/gitlab4j-api) for loading data.


## Usage scenarios

### Governance

* Load info, align people to the org hierarchy, collect stats such as default branches behind, stale branches, etc. 
* Customize loading to create org-specific classes for:
    * User - bi-directional reference with the people/org hierarchy
    * Project - bi-directional references with information pulled from other systems.
* Load [CODEOWNERS](https://docs.gitlab.com/ee/user/project/codeowners/), pom.xml using the [Maven](https://github.com/Nasdanika-Models/maven) model, module-info.java using the [Java](https://github.com/Nasdanika-Models/java) model, and other "metadata" files (including org-specific files), parse, establish cross-references between projects/repositories and other model elements    
* Generate a report with roll-ups along the hierarchy.
* Establish a baseline, generate reports with trends.

### Architecture As Code

See https://github.com/Nasdanika-Models/architecture.

### Loading of resources from GitLab

``gitlab`` URI scheme and [URIHandler](https://download.eclipse.org/modeling/emf/emf/javadoc/2.4.3/org/eclipse/emf/ecore/resource/URIHandler.html).
URI format: ``gitlab://<server alias>/<project alias or ID>/<path>[/!<jar path>]. Server alias might be optional. 

Use:

```java
try (GitLabApi gitLabApi = ...) {
    GitLabURIHandler gitLabURIHandler = new GitLabURIHandler(gitLabApi); // Or a map of server aliases to API instances
    // Optional mapping of project aliases to project ID's
    resourceSet.getURIConverter().getURIHandlers().add(gitLabURIHandler);
    
    URI resourceURI = URI.createURI("gitlab://myServer/myProject/myModel.xmi");
    myModelResource = resourceSet.getResource(resourceURI, true);        
}    

Can be used in combination with custom resource factories, e.g. [Maven](https://github.com/Nasdanika-Models/maven) resource factory to load ``pom.xml`` files.

Note: A dispatch resource factory would be needed to pass ``pom.xml`` files to the Maven factory and other ``.xml`` files to the default ``XMIResourceFactoryImpl``.

To support resource save/update commit api would have to be used. E.g. create a class GitLabTransaction and pass to the URI handler. The handler would add saved resources to the transaction. The transaction would be committed within the GitLabApi try with resource block.
