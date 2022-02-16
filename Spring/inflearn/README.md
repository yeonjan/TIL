# 목차

---

- #### [Spring Boot 환경 설정](#spring-boot-환경-설정)

# Spring Boot 환경 설정

---

## 0. 프로젝트 생성

> 스프링 부트 프로젝트 생성

```
https://start.spring.io
```

> build.gradle
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
