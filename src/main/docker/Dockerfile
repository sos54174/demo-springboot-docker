FROM maven:3.6.3-jdk-11 AS builder
WORKDIR /workspace
RUN mvn clean install && ls -ltr target
FROM openjdk:11
WORKDIR /app
COPY --from=builder /workspace/target/spring-boot-docker-1.0.jar app.jar
CMD ["java", "-jar", "app.jar"]