# base image with Java runtime
FROM openjdk:17 as build

# Information of the maintainer
LABEL maintainer devus.org

# Add the application's packaged file to docker container
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# Execution command
ENTRYPOINT [ "java", "-jar", "/accounts-0.0.1-SNAPSHOT.jar" ]