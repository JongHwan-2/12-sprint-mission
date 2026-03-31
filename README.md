# 🚀 Sprint Mission Project

> 코드잇 스프린트 백엔드 미션을 수행하며  
> Java와 객체지향 설계, 파일 입출력, 컬렉션, 예외 처리 등을 학습한 프로젝트입니다.

<br>

## 👨‍💻 About Project

이 프로젝트는 스프린트 과정에서 진행한 미션을 정리한 저장소입니다.  
기능 구현 자체에 그치지 않고, **왜 이렇게 설계했는지**, **어떤 문제를 겪었는지**,  
그리고 **어떻게 개선했는지**를 함께 기록하는 것을 목표로 했습니다.

<br>

## 🗓️ Development Period

- 진행 기간: `2026.03.xx ~ 2026.03.xx`

<br>

## ⚙️ Tech Stack

### Language
- Java

### Environment
- IntelliJ IDEA
- Git / GitHub

### Concepts
- Object-Oriented Programming
- Collection Framework
- Exception Handling
- File I/O
- Serialization / Deserialization

<br>

## 📌 Main Features

- 사용자 정보 저장 및 조회
- 파일 기반 데이터 관리
- 객체 직렬화 / 역직렬화
- 컬렉션을 활용한 데이터 처리
- 예외 처리 및 유효성 검증
- CRUD 기능 구현

<br>

## 📂 Project Structure

```bash
src
 ┣ common
 ┃ ┗ FileUtils.java
 ┣ entity
 ┃ ┣ User.java
 ┃ ┗ Channel.java
 ┣ repository
 ┃ ┣ UserRepository.java
 ┃ ┗ file
 ┃    ┗ FileUserRepository.java
 ┣ service
 ┃ ┗ UserService.java
 ┗ App.java
