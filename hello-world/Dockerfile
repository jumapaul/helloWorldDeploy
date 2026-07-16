FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY build/libs/hello-world-0.0.1.jar /app/hello-world-0.0.1.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/hello-world-0.0.1.jar"]