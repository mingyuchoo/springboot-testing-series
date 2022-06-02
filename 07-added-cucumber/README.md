# 07-added-cucumber

## How to Set up in `https://start.spring.io`

- Project: `Gradle Project`
- Language: `Java`
- Spring Boot: `2.7.0`
- Project Metadata:

  - Group: `com.mingyuchoo`
  - Artifact: `demo`
  - Name: `<app-name>`
  - Description: `<description>`
  - Package name: `com.mingyuchoo.<app-name>`
  - Packagin: `Jar`
  - Java: `11`

- Dependencies:
  - `Srping Boot DevTools`
  - `Lombok`
  - `Spring Web`
  - `Srping Data JPA`
  - `H2 Database`
  - `Spring REST Docs`

## Additional Dependencies

- `org.sonarqube`
- `jacoco`
- `com.diffplug.spotless`
- `io.cucumber:cucumber-java`
- `io.cucumber:cucumber-junit`
- `io.cucumber:cucumber-spring`

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
