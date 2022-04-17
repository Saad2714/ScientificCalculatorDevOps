FROM openjdk:11
COPY ./target/calc-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "calc-1.0-SNAPSHOT.jar", "MyScientificCalc"]
