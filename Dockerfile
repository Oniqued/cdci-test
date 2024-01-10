FROM openjdk:17-ea-11-jdk-slim
VOLUME /tmp
COPY build/libs/testRDS-1.0.jar FriendShip.jar
ENTRYPOINT ["java", "-jar", "FriendShip.jar"]