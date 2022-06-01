FROM openjdk:18
COPY ./build/libs/usuario-ecommerce-0.0.1-SNAPSHOT.jar usuario-ecommerce-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "usuario-ecommerce-0.0.1-SNAPSHOT.jar"]