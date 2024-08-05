FROM openjdk:17

WORKDIR /app

COPY target/configserver-0.0.1-SNAPSHOT.jar /app/configserverms.jar

ENTRYPOINT ["java", "-jar", "configserverms.jar"]