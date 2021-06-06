FROM openjdk:8-jdk-alpine
COPY target/*.jar easy-travel-config.jar
EXPOSE 8888
ENTRYPOINT ["java", "-jar", "/easy-travel-config.jar"]