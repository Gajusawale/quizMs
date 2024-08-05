FROM openjdk:17

WORKDIR /app

COPY target/ApiGateway-0.0.1-SNAPSHOT.jar /app/apigatewayms.jar

ENTRYPOINT ["java", "-jar", "apigatewayms.jar"]