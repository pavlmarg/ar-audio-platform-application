# Use a lightweight, official Java runtime as the base environment
FROM eclipse-temurin:17-jre-alpine


WORKDIR /app


COPY target/*.jar app.jar


EXPOSE 8080


ENTRYPOINT ["java", "-jar", "app.jar"]