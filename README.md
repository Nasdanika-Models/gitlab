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
