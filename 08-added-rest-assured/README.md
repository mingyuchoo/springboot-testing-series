# 08-added-rest-assured

## How to Set up in `https://start.spring.io`

- Project: `Gradle Project`
- Language: `Java`
- Spring Boot: `2.4.4`
- Project Metadata:
  - Group: `com.mingyuchoo`
  - Artifact: `demo`
  - Name: `<app-name>`
  - Description: `<description>`
  - Package name: `com.mingyuchoo.<app-name>`
  - Packagin: `Jar`
  - Java: `8`

### Default Dependencies

- Dependencies:
  - `Srping Boot DevTools`
  - `Lombok`
  - `Spring Web`
  - `Srping Data JPA`
  - `H2 Database`
  - `Spring REST Docs`

### Additional Dependencies

- `org.sonarqube`
- `jacoco`
- `com.diffplug.spotless`
- `io.cucumber:cucumber-java`
- `io.cucumber:cucumber-junit`
- `io.cucumber:cucumber-spring`
- `io.rest-assured:rest-assured`
- `io.rest-assured:rest-assured-common`
- `io.rest-assured:json-path`
- `io.rest-assured:json-schema-validator`
- `io.rest-assured:spring-mock-mvc`
- `io.rest-assured:sring-web-test-client`
- `io.rest-assured:xml-path`

### NOTE

**`io.rest-assured` version must be '4.2.1'**

## How to run

- `./gradlew cucumber`: run cucumber acceptance test
- `./gradlew test`: run unit test
- `./gradlew build`: run build
- `./gradlew bootRun`: run app

## Check API

- `http://localhost:8080/api/vi/`
- `http://localhost:8080/api/vi/hello`

## How to connect to H2 Database

- `http://localhost:8080/h2`
- Login information
  - Saved Settings: `Generic H2 (Embedded)`
  - Setting Name: `Generic H2 (Embedded)`
  - Driver Class: `org.h2.Driver`
  - JDBC URL: `jdbc:h2:file:./test_db`
  - User Name: `sa`
  - Passworld:
