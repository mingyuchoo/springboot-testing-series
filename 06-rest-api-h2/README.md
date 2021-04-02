# 02-rest-api

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

- Dependencies:
  - `Srping Boot DevTools`
  - `Lombok`
  - `Spring Web`
  - `Srping Data JPA`
  - `H2 Database`
  - `Spring REST Docs`

## Additional Dependencies

- `com.diffplug.spotless`

## How to run

- `./gradlew test`
- `./gradlew build`
- `./gradlew bootRun`
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
