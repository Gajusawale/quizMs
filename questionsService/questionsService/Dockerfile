FROM openjdk:17

WORKDIR /app

COPY target/questionsService-0.0.1-SNAPSHOT.jar /app/questionms.jar

ENTRYPOINT ["java", "-jar", "questionms.jar"]