FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY build/libs/hello-world-2-0.0.1.jar /app/hello-world-2-0.0.1.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "/app/hello-world-2-0.0.1.jar"]