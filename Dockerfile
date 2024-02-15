FROM lippert/adoptopenjdk-17

WORKDIR /app

COPY ./build/libs/github-action-0.0.1-SNAPSHOT.jar ./application.jar

ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=dev", "application.jar"]