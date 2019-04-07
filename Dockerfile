FROM openjdk:8-jdk-alpine
MAINTAINER Cyril Marchive <cyril.marchive@gmail.com>
ARG JAR_FILE
COPY ${JAR_FILE} /Users/cyril/kubernetes-docker/
ADD ${JAR_FILE} authorization-server.jar
EXPOSE 8100
WORKDIR /Users/cyril/kubernetes-docker/
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/authorization-server.jar"]