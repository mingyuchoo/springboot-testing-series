# Coffee Service

## coffee-01-improve-gradle 

### 1. improved `build.gradle`

* 터미널에 테스트 결과를 출력할 수 있도록 `com.adarshr.test-logger` 를 추가했습니다.
* `test-logger` 설정을 추가하고 `test` 타스크가 실행될 때 같이 실행되도록 했습니다.

### 2. improved `com.example.coffee.CoffeeApplicationTests`

* 테스트 결과를 쉽게 알아볼 수 있도록 `@DisplayName` 어노테이션을 추가했습니다.

---

## coffee-02-adjust-logging

### 3. added `logback.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<configuration>
    <include resource="org/springframework/boot/logging/logback/base.xml" />
    <logger name="org.springframework" level="ERROR"/>
</configuration>
```

### 4. changed `application.properties` to `application.yaml`

```yaml
spring:
  main:
    banner-mode: "off"

logging:
  level:
    root: INFO
    org:
      springframework: ERROR
      hibernate: ERROR
```