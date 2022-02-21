# 목차

---

- #### [Spring Boot 환경 설정](#spring-boot-환경-설정)

# Spring Boot 환경 설정

---

## 1. 프로젝트 생성

> 스프링 부트 프로젝트 생성

```
https://start.spring.io
```

> [build.gradle 파일]
>
> > 라이브러리 확인 가능
> >
> > > thymleaf : html 템플릿 엔진

```
dependencies {
	implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
	implementation 'org.springframework.boot:spring-boot-starter-web'
	testImplementation 'org.springframework.boot:spring-boot-starter-test'
}
```

## 2. 라이브러리 살펴보기

> gradle, mave은 의존관계가 있는 라이브러리를 자동으로 함께 다운로드 (스프링코어까지!)

### 스프링 부트 라이브러리

1. spring-boot-starter-web
   1. spring-boot-starter-tomcat: 톰캣 (웹서버)
   2. spring-webmvc: 스프링 웹 MVC
2. spring-boot-starter-thymeleaf: 타임리프 템플릿 엔진(View)
3. spring-boot-starter(공통): 스프링 부트 + 스프링 코어 + 로깅
   1. spring-boot
   - spring-core
   2. spring-boot-starter-logging
   - logback, slf4j

### 테스트 라이브러리

- spring-boot-starter-test
  - junit : 테스트 프레임워크 (4에서 5로 넘어가고 있는 추세)
  - spring-test : 스프링과 통합해서 테스트

## 3. view 환경설정

### resources

<img width="30%" src="https://user-images.githubusercontent.com/60567697/154985832-82eec992-f9c5-4ba3-aa91-a2b017ccd921.png"/>

> resources의 하위 폴더 static에는 메인 페이지의 html이 존재, templates에는 ViewName에 해당하는 html이 존재

### 동작 환경 (템플릿 엔진 이용)

<img width="60%" src="https://user-images.githubusercontent.com/60567697/154985123-08e0843a-e315-42e5-8fe8-0efafb6cd3a3.png"/>

> Controller에서 return 값으로 문자를 반환 -> viewResolver가 "resources:templates/ +{ViewName}+ .html"을 찾음

## 4. 빌드 & 실행 (윈도우)

1. cmd
2. gradlew build
3. cd build/libs
4. java -jar hello-spring-0.0.1-SNAPSHOT.jar
5. Ctrl + C -> 종료
- 실행 X -> 2번에서 gradlew clean build
- 인텔리제이의 포트 사용 종료
