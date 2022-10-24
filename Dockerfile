FROM amazoncorretto:11-alpine
EXPOSE 8081
ADD target/pmmanutencao-0.0.1-SNAPSHOT.jar pmmanutencao-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/pmmanutencao-0.0.1-SNAPSHOT.jar"]