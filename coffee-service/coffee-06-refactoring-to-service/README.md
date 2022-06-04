# Coffee Service

---

## coffeeService-01-improve-gradle

---

### 1. improved `build.gradle`

* 터미널에 테스트 결과를 출력할 수 있도록 `com.adarshr.test-logger` 를 추가했습니다.
* `test-logger` 설정을 추가하고 `test` 타스크가 실행될 때 같이 실행되도록 했습니다.

### 2. improved `com.example.coffee.CoffeeServiceApplicationTestsonTests`

* 테스트 결과를 쉽게 알아볼 수 있도록 `@DisplayName` 어노테이션을 추가했습니다.

## coffeeService-02-adjust-logging

---

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
---
server:
  servlet:
    encoding:
      force-response: true

spring:
  main:
    banner-mode: off

logging:
  level:
    root: INFO
    org.springframework: ERROR
    org.hibernate: ERROR
```

---

## coffeeService-03-implement-a-class

### 5. check a User Story and Acceptance Criteria

* 사업자: 저는 키오스크로 커피를 주문을 받아 판매하는 카페 주인
* 타겟 시장: 마곡 LG CNS 직원(07~19시 E13,E14동 근무자, 25~47세, 남/녀)
* 개발자: 키오스크 단말기와 통신하는 REST API 형태의 커피 서비스를 만들고 있는 나

```gherkin
# Feature: 로스팅된 커피 목록 조회하기

As a `친한 동기와 식사를 마친 직장인`
I want `어떤 커피 원두가 있는지 확인하고 싶습니다.`
So that `내 입맛에 맞는 커피를 마시려고`

  Given `원산지에 따른 로스팅된 커피 원두가 있는 상황에서`
  When `커피 원두 전체보기를 요청했을 때`
  Then `커피 원두가 목록으로 나와야 합니다.`

    Examples:
    | 1. 브라질 산토스
    | 2. 콜롬비아 수프리모
    | 3. 자메이카 블루마운틴
    | 4. 에티오피아 예가체프
    | 5. 케냐 AA
    | 6. 코스타리카 따라주
    | 7. 탄자니아 AA (킬리만자로)
    | 8. 예멘 모카 마타리
    | 9. 하와이 코나
    | 10. 과테말라 안티구아
    | 11. 파나마 게이샤
    | 12. 엘살바도르

  Given `원산지에 따른 로스팅된 커피 원두가 없는 상황에서`
  When `커피 원두 전체보기를 요청했을 때`
  Then `"잠깐 다른 볼일 보시고 오실래요? 30분 뒤면 맛있게 로스팅된 커피 원두가 준비되거든요."라는 메시지가 나와야 한다.`
```

### 6. add `Coffee` and `CoffeeTest`

* Create files
* Add test case to `CoffeeTest`
* Implement `Coffee`
* Test the implemented method(function)

## coffeeService-04-add-jacoco

---

### 7. add `jacoco` to `build.gradle`

```groovy
plugins {
	id 'jacoco'
}

jacoco {
	toolVersion = '0.8.8'
}

jacocoTestReport {
	reports {
		xml.required = false
		csv.required = false
		html.outputLocation = layout.buildDirectory.dir('reports/tests/jacoco')
	}
	dependsOn test
}

tasks.named('test') {
	jacoco {
		enabled = true
		destinationFile = layout.buildDirectory.file('test-results/jacoco/jacocoTest.exec').get().asFile
	}
	finalizedBy jacocoTestReport
}
```

## coffeeService-05-add-repo-to-jenkins

---

* Worked in Ubuntu 22.04

### 8. create git repo

```bash
$ sudo apt update
$ sudo apt install -y openssh-server
$ sudo apt service ssh start

$ sudo useradd --system --user-group --shell /bin/bash --create-home --home-dir /home/git git
$ sudo su - git

$ mkdir -p $HOME/.ssh
$ chmod 700 $HOME/.ssh
$ touch $HOME/.ssh/authorized_keys
$ chomod 600 $HOME/.ssh/authorized_keys

$ mkdir -p $HOME/repo
$ git init --bare $HOME/repo/coffee-service.git
Initialized empty Git repository in /home/git/coffee-service.git

$ exit
```

### 9. run jenkins

```bash
$ sudo apt update
$ sudo apt install -y docker.io
$ sudo url -SL https://github.com/docker/compose/releases/download/v2.5.0/docker-compose-linux-x86_64 -o $DOCKER_CONFIG/cli-plugins/docker-compose
$ sudo chmod _+x /usr/local/bin/docker-compose
$ sudo usermod -aG docker $USER

$ sudo dockerd
```

download jenkins docker project from <https://github.com/mingyuchoo/docker-composes>

```bash
$ cd jenkins
$ docker network create my-net
$ npm run docker:up
```

connect to <http://localhost:8888> and
set it up for start

#### For an new proejct

1. New Item
2. Enter an item name
3. Freestyle project
4. Soruce Code Management
  * Git
  * Repository URL: git@172.18.0.1:repo/coffee-service.git
  * Credentials: create and choose one
  * Branchs to build
    * Branch Specifier: `*/feature/mgch`
  * Build Triggers
    * Trigger builds remotely (e.g., from scripts): check
    * Authentication Token: Jekins account's API Token
  * Build Environment
    * Delete workspace brefore build starts: check
  * Build
    * Use Gradle Wratter
      * Make gradlew executable: check
    * Tasks: test
  * Post-build Actiosns
    * Publish JUnit test result report
      * Test resport XMLs: `build/test-results/test/*.xml`
    * Record JaCoCo coverage report
  * Save

### 10. Push code to repo

```bash
$ git add .
$ commit -m "some-message"
$ git push
```

## coffee-06-refactoring-to-service

---

### 11. change `Coffee*` classes to `CoffeeService*` classes

* `Coffee` -> `CoffeeService`
* `CoffeeTest` -> `CoffeeServiceTest`

