FROM openjdk:17

WORKDIR /app

COPY target/ServiceRegistry-0.0.1-SNAPSHOT.jar /app/serviceregms.jar

ENTRYPOINT ["java", "-jar", "serviceregms.jar"]