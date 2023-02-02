# define base docker image

FROM openjdk:19
LABEL maintainer="Eduardo Lopes"
ADD target/spring-boot-docker-poc-0.0.1-SNAPSHOT.jar spring-boot-docker-poc.jar
ENTRYPOINT ["java", "-jar", "spring-boot-docker-poc.jar"]
