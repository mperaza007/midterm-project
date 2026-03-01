#Docker image tag for Eclipse Temurin OpenJDK 21. Includes the full JDK
FROM eclipse-temurin:21-jre-jammy

WORKDIR /app

COPY target/*.jar app.jar



ENTRYPOINT ["java", "-jar", "app.jar"]