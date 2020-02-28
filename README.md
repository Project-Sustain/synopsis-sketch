# Maven repository hosting the Synopsis sketch artifacts.

We follow an approach derived from [here](https://gist.github.com/fernandezpablo85/03cf8b0cd2e7d8527063) to host the artifacts.

## Publish a new version
To publish a new version please follow the instructions given below.

### Pre-requisites
- Apache Maven 3

### Instructions
- Checkout the branch corresponding to the version from the repository and build the jar
`` git checkout v1.0.1; gradle build``
- Copy the jar (e.g.: cp $PROJECT_HOME/build/libs/synopsis-sketch-1.0.jar /tmp/)
- Checkout the 'mvn-repository' branch
`` git checkout mvn-repository``
- Take a copy of the pom from one of the existing releases and update the version property. Let's assume that the copy of this pom is available at /tmp/sketch-1.0.pom. It is not necessary to update the version in the file name.
- Use the [Maven install plugin](https://maven.apache.org/guides/mini/guide-3rd-party-jars-local.html) to install the jar and the pom file into the repo.
`` mvn install:install-file -DgroupId=sustain.synopsis -DartifactId=sketch -Dversion=1.0.1 -Dfile=/tmp/synopsis-sketch.jar -Dpackaging=jar -DlocalRepositoryPath=. -DcreateChecksum=true -DpomFile=/tmp/sketch-1.0.pom``
Make sure to look at the version, file, and pomFile properties.
- Add the updated and newly added files to Git, commit, and push to the `mvn-respository` branch.
- * Do not merge this branch with the master *
