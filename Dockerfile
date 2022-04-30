FROM adoptopenjdk/openjdk11

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} DPS_MIDDLEWARE.jar

ENTRYPOINT ["java", "-jar", "DPS_MIDDLEWARE.jar"]