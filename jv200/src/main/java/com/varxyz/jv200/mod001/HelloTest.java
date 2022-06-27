package com.varxyz.jv200.mod001;

public class HelloTest {
	public static void main(String[] args) {
		Hello h = new Hello(); // Hello 객체 생성
		System.out.println(h.sayHello());
	}
}

// 멤버 : 변수 + 메소드

// 모든 클래스는 하나의 생성자 가짐
// 없을 시, 디폴트 생성자 자동 삽입(아규먼트, 바디 없음)

// import 다른 패키지의 클래스 참조시, 사용
// 패키지이름 java 사용X

// primitive(기본형) type 기본 0
// 정수 byte, short, int, long 기본값 int
// 실수(소수) float, double 기본값 double
// 논리 boolean (true/false) 기본값 false
// 문자 char 디폴트값 '\u0000'
// reference(참조형) type 기본 null
// 그 외
// string ""
// casting int->byte 문제 발생

// primitive type reference type 차이 : 바로 할당하느냐 new 객체 생성하느냐 

// array 
// 2차원 배열은 부모 선언 필수

// enhanced for loop


// array resizing
// 배열은 한 번 지정된 사이즈를 조정할 수 없음
//resizing 가능한 collection(set, list ..) 등장
// System.arraycopy() // package - java.lang / System - arraycopy()

// Subclassing : 클래스 상속 (부모 - 자식 / super - sub)
// public class Manager(자식) extends Employee(부모){}
// 객체 관계에서 자식은 부모를 알지만 부모는 자식을 모름(화살표) 의존성
// 상속은 is kind of

// Access Control
// public 접근 제한 X
// default 같은 패키지내에서만 접근 가능 
// protected 같은 패키지내에서, 다른 패키지의 자손클래스만 접근 가능
// private 같은 클래스내에서만

// overriding
// 재정의
// name / return type / argument list 동일
// super 부모 / this 본인

// 다형성 Polymorphism
// 객체지향의 핵심
// Employee e = new Manager;
// e.a() call 가능 / e.c()-2(@override) call 가능 / e.b() call 불가능
// e instanceof Manager
// Casting Objects
// Manager m = (Manager) e; m.b() call 가능

// overloading methods 메소드 오버로딩
// 하나의 클래스안에 동일이름의 메소드라도 아규먼트가 다르면 다른 메소드로 취급
//  + 생성자 오버로딩

// 생성자
// super, this

// 최상위 class -> object 클래스의 속성, 메소드 ??
// public class Employee extends Object 형태
// - Object 클래스
// toString()
// equals() : 문자열 값 비교 object에서 == 아닌 equals 쓰는 이유 오버라이딩이 가능해서
// - String s1 = "유비";
// - String s1 = new String("유비");

// Wrapper 클래스
// Integer inter = new Integer(10);

// static
// 클래스 이름.상수

// parseInt
// 사용 : int num = Integer.parseInt("100");

// final
// 1. 변수 : 변수 앞의 final은 상수처럼 사용
// 2. 메소드 : 오버라이딩 하지못함
// 3. 클래스 : 상속받지못함

// enumerated type
// 상수를 객체화

// static imports

// abstract class 
// 클래스는 객체 생성하는 것
// 1. 추상클래스는 객체생성을 못하는 클래스 (인스턴스화x)
// 2. 클래스내에 추상메소드가 존재하면 그 클래스는 반드시 추상클래스로 선언해야함
// 3. 메소드 바디가 없음
// public abstract class Employee 추상클래스
// public void abstract getName() 추상메소드
//  animal - dog, cat
// 부모가 추상클래스면 자식도 추상클래스
// 자식클래스는 부모의 추상메소드를 구현해야함

// interface
// 추상메소드만 뽑아서 따로 정의한 것
// 추상메소드의 집합
// 변수x, 상수만 가질 수 있음

// 은행계좌정보 public abstarct class Account

// 예외처리
// checked exception / unchecked exception 나눈 이유?
// checked exception 반드시 에러처리 해야 함 / 컴파일러가 예외처리 확인
// unchecked exception은 runtime의 자식들 / 에러처리 강제 x / 컴파일러가 예외처리 확인 x
// 
// try-catch
/* try { 
 * 	예외가 발생할 수 있는 코드 
 * }catch(Exception){ 
 * 	예외가 발생했을 때 처리할 코드 
 * }finally{
 *  예외발생유무와 관계없이 처리할 코드
 * }
 * throws Exception
 * 
 * 2022-06-20
 * <<interface>>
 * collection
 * - add(Object o)
 * - remove()
 * - get()
 * set, list, map
 * - set : 중복 x, 순서 x
 * - list : 중복 허용, 순서 허용
 * - map : (key - value)
 * interface끼리 상속 가능
 * interface는 객체를 만들 수 X
 * Set - HashSet
 * List - ArrayList
 * Map - HashMap 
 * 
 * Generics
 * 
 * customer, customerservice 만듬
 * 
 * 2022-06-21
 * service는 하나만 있으면 됨 -> 특정 어느 하나에 국한되지 않음
 * 모두에게 공통적인 기능 제공
 * 
 * java - db
 * 테이블 - 클래스
 * 레코드 - 인스턴스
 * 칼럼 - 속성
 * java는 reference로 관계 형성
 * 
 * mysql 설치
 * 환경변수 PATH 설정 C:\Program Files\MySQL\MySQL Server 8.0\bin
 * 
 * mysql 접속 명령어
 * cmd창에 mysql -u root -p enter후
 * 비밀번호(admin) 입력
 * 
 * 모든 데이터베이스 확인 : 
 * show databases;
 * 
 * 데이터베이스 선택 : 
 * use [데이터베이스명];
 * use mysql;
 * 
 * user테이블의 host와 user 확인 : 
 * select host, user from user;
 * 
 * 사용자 생성 : 
 * create user '아이디'@localhost identified by '비밀번호';
 * create user 'jv250'@localhost identified by 'jv250';
 * 
 * 데이터베이스 생성 :
 * create database [데이터베이스명] default character set utf8;
 * create database jv250 default character set utf8;
 * 
 * jv250[데이터베이스]에 있는 모든 것을 'jv250'@localhost란 사용자에게 권한 부여 :
 * grant all privileges on jv250.* to 'jv250'@localhost with grant option;
 * 
 * 적용한 것을 바로 적용시키기 : 
 * flush privileges;
 * 
 * 나가기 :
 * exit
 * 
 * eclipse에서 mysql 사용하기
 * 탭에서 Window -> Show View -> Data Source Explorer
 * 
 * 만든 데이터베이스 이름, username, password 데이터베이스 생성 시 설정했던 것과 동일하게 지정 
 * jar 연결 C:\Users\Administrator\.m2\repository\mysql\mysql-connector-java\8.0.29
 * 
 * 
 * SQL(Structured Query Language)
 * 1. DQL(Data Query Language)
 * - SELECT
 * 2. DML(Data Manipulation Language)
 * - INSERT
 * - UPDATE
 * - DELETE
 * 3. DDL(Data Definition Language)
 * - CREATE
 * - ALTER
 * - DROP
 * - TRUNCATE
 * - RENAME
 * 4. DCL(Data Control Language)
 * - GRANT 권한부여
 * - REVOKE 권한해제
 * 5. TCL(Transaction Control Language)
 * - COMMIT
 * - ROLLBACK
 * 
 * 2022-06-22
 * Java SE(표준 에디션) -> Java EE(엔터프라이즈 에디션)
 * Account 테이블 만들기
 * foreign key 사용
 * JDBC(Java Database Connectivity)
 * 패키지
 * - java.sql.*
 * - javax.sql.* (확장형 enterprise에서 주로 씀 요즘엔 경계 x)
 * java는 문자열로 sql 전달
 * 
 * 새 프로젝트 생성 시
 * pom.xml 수정하기!
 * 
 * 2022-06-24
 * 프로젝트 만들기
 * - Libraies(jdk11.0.15_9)
 * - Compiler 11로 바꾸기
 * - pom.xml 바꾸기
 * 
 * 제일 먼저 만들 클래스?
 * <domain>
 * Customer.class(기본 데이터부터 만들기)
 * Account.class
 * SavingsAccount.class, CheckingAccount.class
 * <exception>
 * 예외클래스 추가(InsufficientBalanceException.class, OverdraftException.class)
 * <dao>
 * DataSourceManager.class
 * final은 선언과 동시에 초기화해줘야 함
 * 최소한 생성자에서 해줘야 함
 * 
 * static{} 한 번만 실행
 * file에 보관 왜? 1. 보안성의 문제 2. 내부파일에 저장하는 것이 일반적
 * 
 * I/O
 * stream : byte의 흐름
 * file은 stream을 모아놓은 곳
 * InputStream, OutputStream, Read, Write 최상위 추상클래스
 * FileInputStream("경로"), FileOutputStream() 사용가능한 클래스
 * OOP는 경로안의 .까지 다시 한 번 캡슐화 시켜서 객체 만듬
 * 그래서 File이란 클래스가 나타난 것 그 안에 경로가 있는 것
 * ex) 필통: 연필, 지우개를 넣을 곳을 새로 만든 것(인간적인 발상)
 * FileInputStream은 byte을 읽는 것 (8bit) int는 2의 32승 -> int는 4byte double 8byte short 2byte
 * char는 2byte
 * FileInputStream(), FileOutputStream()안에는 read(), write() 메소드 있음
 * byte읽는 것 버퍼
 * 버퍼는 채우는 것(음료수 빨대)
 * read는 읽은 byte를 return시킴 다 읽었을 경우 -1을 return while써서 활용 가능
 * 
 * /로 시작되면 절대주소
 * 
 * DAO
 * 
 * 프로젝트 아이디어(7/9)
 * 
 * 2022-06-27
 * 조별로 수요일까지 어떤 프로젝트 할 것인지 정하기(요구사항 테스트)
 * 1. 목적 명시
 * 2. 시스템에서 제공하는 기능적 요구사항
 * 기능적 요구사항
 * 비기능적 요구사항 (속도..)
 * 3. 소프트웨어적 요구사항(소프트웨어적으로 필요한 기능적 요구사항 목록 작성 : JDK, DB)
 * 4. 유즈케이스 목록
 * 5. 클래스 목록
 * 6. 관련 이슈
 * 
 * EagerLoading
 * LazyLoading
 * 
 * Tomcat 서버 연결
 * tomcat https://tomcat.apache.org/download-80.cgi
 * 64bit window.zip 다운
 * 환경변수 설정
 * CATALINA_HOME
 * C:\ncs\apache-tomcat-8.5.81
 * PATH
 * %CATALINA_HOME%\bin
 * 
 * 
 * 
 * */