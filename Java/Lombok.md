# Lombok

## **자주 사용되는 Lombok 어노테이션**

### @Getter, @Setter

- 접근자, 설정자를 자동 생성

### 생성자

- @NoArgsConstructor → 매개변수가 없는 생성자 생성

- @AllArgsConstructor → 모든 필드를 매개변수로 하는 생성자 생성

- @RequiredArgsConstructor → final이나 @NonNull인 필드값만 매개변수로 하는 생성자 생성

### @ToString

- toString 메소드 생성
- exclude를 사용해 제외하고 싶은 필드 선택 가능
  - `@ToString(exclude = "password")`

### @EqualsAndHashCode

- equals, hashCode 자동 생성
- callSuper를 사용해 부모 클래스의 필드까지 감안할지 선택
  - `@EqualsAndHashCode(callSuper = true)`

### @Data

- 아래 어노테이션을 한번에 설정

- @Getter

- @Setter

- @RequiredArgsConstructor

- @ToString

- @EqualsAndHashCode
