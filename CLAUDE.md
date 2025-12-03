# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## 프로젝트 개요

이 프로젝트는 Java 학습을 위한 연습 프로젝트입니다. IntelliJ IDEA를 사용하여 관리되며, Maven이나 Gradle 같은 별도의 빌드 도구 없이 IntelliJ의 내장 빌드 시스템을 사용합니다.

- **Java 버전**: JDK 17
- **IDE**: IntelliJ IDEA
- **빌드 시스템**: IntelliJ IDEA 내장 컴파일러
- **출력 디렉토리**: `out/production/java_practice/`

## 프로젝트 구조

```
java_practice/
├── src/
│   ├── Main.java              # 메인 엔트리 포인트
│   └── chapter1/              # 챕터별 학습 코드
│       ├── MyNewClass.java
│       └── One6.java          # 증감 연산자 예제
└── out/                       # 컴파일된 .class 파일들
```

### 아키텍처 특징

- **챕터 기반 구조**: 학습 내용이 `chapter1`, `chapter2` 등의 패키지로 구조화되어 있습니다.
- **독립적인 예제**: 각 챕터의 클래스들은 특정 Java 개념을 학습하기 위한 독립적인 예제입니다.
- **메인 클래스**: 루트의 `Main.java`가 주 실행 파일이며, 필요시 챕터의 클래스들을 import하여 실행합니다.

## 개발 명령어

### 컴파일 및 실행 (IntelliJ IDEA)

IntelliJ IDEA에서:
- **실행**: `Shift+F10` (Windows/Linux) 또는 `Ctrl+R` (Mac)
- **디버그**: `Shift+F9` (Windows/Linux) 또는 `Ctrl+D` (Mac)
- **빌드**: `Ctrl+F9` (Windows/Linux) 또는 `Cmd+F9` (Mac)

### 명령줄에서 실행

```bash
# 특정 클래스 컴파일
javac -d out/production/java_practice src/Main.java

# 메인 클래스 실행
java -cp out/production/java_practice Main

# 특정 챕터의 클래스 실행
java -cp out/production/java_practice chapter1.One_6
```

## 새로운 학습 예제 추가하기

1. 해당 챕터 디렉토리에 새 Java 파일 생성 (예: `src/chapter2/Example.java`)
2. 패키지 선언 포함 필수: `package chapter2;`
3. 독립 실행 가능한 예제의 경우 `main` 메서드 포함
4. 전체 프로젝트에서 사용할 경우 `Main.java`에서 import

## 코드 규칙

- 각 챕터는 특정 Java 개념에 집중 (예: chapter1은 기본 연산자)
- 한글 주석 사용으로 학습 내용 명확히 설명
- 각 예제는 독립적으로 실행 가능하도록 작성
