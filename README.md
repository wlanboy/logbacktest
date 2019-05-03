# logbacktest
Simple CLI tool to test logback on localhost

## Dependencies
At least: Java 8 and Maven 3.5

## Build Simple logback tool
mvn package -DskipTests=true

## Run Simple logback tool
### Environment variables
export LOGBACKSERVER=127.0.0.1:5000

### Windows
java -jar target\logbacktester-0.1.1-SNAPSHOT.jar

### Linux (service enabled)
./target/logbacktester-0.1.1-SNAPSHOT.jar start
