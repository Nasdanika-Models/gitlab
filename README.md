# GitLab
GitLab model - users, groups, projects, repositories, branches, commits, ... 
Can be used for loading and storing GitLab objects for cross-referencing with other objects in the enterprise (e.g. people in the org hierarchy) and analysis.

Uses [gitlab4j](https://github.com/gitlab4j/gitlab4j-api) for loading data.


## Usage scenarios

### Governance

Load info, align people to the org hierarchy, collect stats such as default branches behind, stale branches, etc. 
Generate a report with roll-ups along the hierarchy.
Establish a baseline, generate reports with trends.
