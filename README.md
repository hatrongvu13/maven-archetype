# maven-archetype

Base project template of hatrongvu

## Build template from source
* Step 1: Build archetype from project
```shell
mvn archetype:create-from-project
```
* Step 2: Install Archetype into Local Repository
```sh 
cd target/generated-sources/archetype
mvn install
```
* Step 3: Create new project from archetype
```sh 
mvn archetype:generate \
    -DarchetypeGroupId=com.xxx \
    -DarchetypeArtifactId=archetype-custom-archetype \
    -DarchetypeVersion=0.0.1-SNAPSHOT \
    -DgroupId=com.xxx \
    -DartifactId=new-app \
    -Dversion=0.0.1-SNAPSHOT

```