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
 *  ----------------------------------------2022-06-20----------------------------------------------
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
 *  ----------------------------------------2022-06-21----------------------------------------------
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
 *  ----------------------------------------2022-06-24----------------------------------------------
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
 * /로 시작되면 절대주소 없으면 무조건 상대주소
 * 
 * DAO
 * 
 * 프로젝트 아이디어(7/9)
 * 
 *  ----------------------------------------2022-06-27----------------------------------------------
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
 *  ----------------------------------------2022-06-28----------------------------------------------
 * Web / internet
 * HTTP / HTML
 * HTTP / HTML
 * Servlet / JSP
 * html 정적문서
 * + javascript 동적문서
 * 정적문서를 애플리케이션화
 * 요청
 * 응답
 * 브라우저가 하는 일 html 파싱
 * 웹 동작
 * HTTP 요청메소드 (GET POST PUT DELETE)
 * URL 
 * 파라미터
 * 요청시 요청메소드 url 파라미터
 * 응답코드 : 성공할 경우 성공 화면 성공이 아닐 떄 404..
 * 응답타입
 * 응답컨텐츠 body
 * 
 * Servlet
 * html은 서버에 위치하고 클라이언트에서 동작
 * 처리결과는 html
 * 
 * 웹 사이트와 URL
 *  웹 사이트는 정적 문서로 구성된 사이트
 *  URL 구성
 *  	protocol://host:port/path/file 
 *  	http://www.season.com:80/spring/april.html   
 *		http://www.season.com/spring/april.html
 * 		http://www.season.com
 * 	파라메터
 * 		주소 뒤에 추가로 붙는 데이터
 * 		?를 사용하여 주소 경로와 구분
 * 		구분은 &로 함          
 * 		http://www.season.com/spring/april.html?weather=sunny&temp=25
 * 
 * 	HTTP 메소드(GET)
 * 		요청 방식에 따라 크게 GET/POST 구분
 * 		GET 요청 방식
 * 			단순히 서버에게 자원(HTML, 이미지, 문서)을 URL을 통해 요청하는 방식
 * 			필요한 데이터를 URL뒤에 덧붇여 전송
 * 			데이터 크기 제약이 있으며 북마킹을 허용(지원)
 * 			브라우저 캐싱에 의한 보안 문제 야기
 * 		POST 요청 방식
 * 			주로 폼에서 사용되는 방식으로 웹 컨텐츠의 내용을 변경하기 위해 사용
 * 			필요한 데이터를 HTTP요청의 메세지 바디를 통해 전송
 * 			데이터의 양이 많거나 URL에 노출되지 말아야 할 때 사용
 * 			POST 로그인시(보안문제)
 * 			북마킹 허용 x
 * 
 * 웹 애플리케이션
 * 	웹 사이트 + Dynamic working service (CGI Processing)
 *  CGI(Common Gateway Interface)
 *  	-. 웹 서버에 존재하는 프로그램을 호출할 수 있는 기술
 *  	-. Perl, C 등 다양한 언어로 작성
 *  	-. Process loading 방식
 *  
 *  ASP.NET, Servlet/JSP
 *  
 *  웹 컨테이너
 *  	-. 웹 컴포넌트(servlet/jsp 등) 실행 관리를 위한 프레임워크
 *  		ex) Tomcat, 레진, Glassfish 등
 *  	-. 서블릿과 웹서버간의 커뮤니케이션 지원
 *  	-. 서블릿 라이프 사이클 관리
 * 		-. 요청에 대한 멀티 스레딩 지원
 * 		-. 보안 및 오류에 대한 처리 지원
 *  		
 *  WAS(Web Applicaton Server)
 *  웹 애플리케이션이 동작하는 서버
 *  
 *  servlet 실습
 *  web.xml
 *  <url-pattern>/hello.view</url-pattern> .view로 속이는 것 (네이버는 .nhn <- 없는 명칭)
 *  
 *  ----------------------------------------2022-06-29----------------------------------------------
 *  Servlet 인터페이스와 서블릿 라이프사이클
 *  	init()/service()/destroy()/getServletConfig()
 *  	1. 요청에 의해 특정 서블릿 호출
 *  	2. 해당 서블릿 생성 및 로드
 *  	3. init() 메소드 호출 (최초 1회 호출)
 *  	4. service() 메소드 호출 ex) doGet, doPost
 *  	5. destroy() 메소드 호출 (소멸 직전 1회 호출)   
 *  
 * servlet 프로젝트 구조 (중요!)
 * Tomcat
 *  -webapps
 *   -ROOT (http://localhost:8080/)
 *   -JV300 (http://localhost:8080/jv300)
 *   	-index.html
 *   	-config.view (http://localhost:8080/jv300/config.view) // url-pattern이 /config.view일 경우
 *   	-mod003(패키지)
 *   		-abc.html (http://localhost:8080/jv300/mod003/abc.html)
 *   		-abc.view (http://localhost:8080/jv300/mod003/abc.view) // url-pattern이 /mod003/abc.view일 경우
 *   	-WEB_INF
 *      	-web.xml (D.D)
 *      	-classess 
 *      		-com.varxyz.jv300
 *      			-mod003
 *      				-AbcServlet.class
 *      	-lib
 * 
 * <form action=""></form> action에 들어갈 것?
 * - Servlet
 * - action은 submit 눌렀을 때 처리하는 것
 * submit
 * 
 * 주차관리시스템
 * 사용자?
 * 제공하는 것?
 * 누가 이 시스템을 구입해서 사용하는 가?
 * 주차자리가 비었다는 건 어떻게 파악하는가? 센서 -> 이렇게 되면 주차장사업에 앱이 달려가는 것이기 때문에 안됨
 * 
 * 명세화 금요일까지
 * 한쪽은 고객 한쪽은 시스템개발
 * 고객이 이런 시스템이 필요하다고 설명
 * 고객이 말하는 걸 글로 다 옮기기
 * 옮긴 것에서 요구사항 뽑기 
 * 온라인에서 오프라인에서 일어나는 것을 구분
 * 시스템 개발하는 사람들은 요구사항을 구분짓기
 * 인터뷰를 통해서 요구사항 뽑아내기
 * 최대 15개 안쪽으로 목록 뽑기
 * 
 * 회원가입 폼(add_user.html)
 * 	회원 아이디	 : userId
 * 	비밀번호   : passwd
 * 	이름      : userName
 * 	주민번호   : ssn (앞의 6자리만)
 * 	이메일1   : email1(아이디)
 * 	이메일2   : email2(메일도메인 ex: naver.com, gmail.com...)
 * 	관심분야   : concerns(체크박스 : 다중 선택가능, ex) Java, Servlet/JSP, EJB, Android, Spring)
 *  
 *  회원가입 서블릿(AddUserServlet.java)
 *   회원이 등록한 정보를 받아 회원가입에서 입력한 정보를 출력
 * 
 *  회원가입 폼 작성시, 스크립트나 css 사용가능
 *  체크박스처럼 하나 이상의 값이 전달되는 경우 서블릿에서 파라메터 정보 받는 법
 *   String[] concerns = request.getParameterValues("concerns")
 *  
 * ----------------------------------------2022-06-30-----------------------------------------------
 * JSP (Java Server Page)
 *  -. 사용자를 위한 동적 뷰를 제공한다.
 *  -. 프리젠테이션 코드를 서블릿이 아닌 JSP를 통해 작성함으로써 코드 작성을 간소화
 *  -. 서블릿과 JSP를 상호보완적으로 사용함으로써 Model2 아키텍처 기반의 애플리케이션을 작성한다.
 *  -. 웹 디자이너와 프로그래머의 역할 구분을 보다 증진시킨다.
 * 
 * JSP 특징
 *  -. 기본적으로 JSP는 서블릿 인스턴스로 변환된다.
 *  -. JSP페이지를 작성한 후 저장하면 컨테이너에 의해 (자바)소스변환, 컴파일, 실행이 자동으로 이뤄진다.
 *  	hello.jsp ===> hello.java ===> hello.class ===> 실행(서블릿)
 *  			translation      compile 			  runtime
 *  -. JSP는 서블릿보다 작성 과정이 간단하지만 디버깅은 상대적으로 어렵다.
 *  
 * JSP 라이프사이클
 * 	-. 기본적으로 서블릿과 동일
 *  -. jspInit()메소드
 *   	초기화, 오버라이딩
 *  -. jspDestroy()메소드
 *  	소멸, 해제, 오버라이딩
 *  -. _jspService()메소드
 *      jsp페이지 자신, 오버라이딩 불가능
 *      
 *  JSP 파일 저장 위치
 *   -. JSP는 html과 동일 위치상에 저장 가능
 *   -. WEB-INF의 하위 폴더에서도 저장 가능
 *  
 *  JSP 주요 태그
 *  	주석		:	<%-- --%> html주석도 사용가능 차이점은? jsp주석은 소스보기에서 안보임
 *  	지시자	: 	<%@ page %>, <%@ include %>, <%@ taglib %> 첫 줄
 *  	(directive)
 *  	스크립팅	:	<%! 멤버 선언 %>, <% 자바 코드 %>, <%= 출력 %>
 *  	엘리먼트
 *  	표현식	: ${표현식}
 *  	커스텀 태그 : JSTL
 *  
 *  Page 지시자
 *  	import="java.util.*"
 *  	contentType="text/html; charset=UTF-8"	MIME타입과 문자 인코딩 설정
 *  	session=true (디폴트값은 true)				해당 페이지가 세션을 지원하려면 true
 *  	errorPage="에러를 처리할 페이지" 
 *  	isErrorPage="true"	(디폴트값은 false)		이 값이 true일 때 exception내장 객체를 사용 가능  
 * 		pageEncoding         					JSP페이지의 문자 인코딩을 정의(150-8859-1)
 * 		isElgnored, isThreadSafe, Language, extends, buffer, autoFlush, info
 * 
 * 스크립틀릿
 * 	JSP페이지내에서 자바 코드를 사용할 수 있도록 한다.
 *  주의할 점은 스크립틀릿 내의 자바코드와 HTML코드는 분리되어서 처리 되어야 한다.
 *  스크립틀릿 코드의 남용은 코드에 대한 가독성을 떨어뜨리고 유지보수를 어렵게 한다.
 *  <%
 *  	if(age  > 10){
 *  %>
 *  		You need a ticket.
 *  <%
 *  	}else{
 *  %>
 *  		You are free
 *  <%
 *  	}
 *  %>
 *  표현식
 *  	Ten is <%= (2 * 5) %>
 *  	Thank you, <b> <%=name %> </b> for registration
 *  	The Current day and time is <%= new java.util.Date() %>
 *  
 * JSP는 html안에 자바코드 작성 가능 
 * servlet service메소드를 오버라이딩한 것이 jsp
 * service메소드 그 자신이 jsp인 것
 * model2 아키텍처는 servlet는 비즈니스 역할 jsp는 보이는 역할만 하는 것 
 * spring은 java bins모델 -> getter setter  
 * 
 * MVC
 * Model : User, UserService, UserDao
 * View : *.view / add_user.jsp
 * Controller : *.do / AddUserServlet.java(add_user.do)
 * 
 * ----------------------------------------2022-07-01-----------------------------------------------
 * MVC 패턴
 *  -. UI개발자와 비즈니스 개발자와의 분업 개발 제공
 *  -. 동시 사용자 증가에 따른 시스템 확장성 제공
 *  -. Low coupling, High cohesion을 통한 시스템 유지 보수의 편리성 제공 ( 낮은 결합도, 높은 응집도 )
 *  
 * 모델 2아키텍처
 *  -. 썬 마이크로시스템의 베스트 가이드 라인
 *  -. MVC패턴 구현을 위한 베스트 컴포넌트
 *  	Model	:	(P)Java, Java Beans, EJB (S) DAO, DTO
 *  	View	:	   HTML, JSP, XML		     Servlet
 *  	Controller  :  Servlet					 JSP
 *  
 * 컨트롤러의 주요 역할
 * 	서블릿에 의해 구현될 컨트롤러는 다음과 같은 역할을 처리한다.
 *  -. 클라이언트의 요청 파라메터 정보를 구한다. getParameterValues / getParameterNames
 *  -. 요청 파라메터에 대한 유효성 검증 및 데이터 변환 작업을 처리한다.
 *  -. 요청 처리에 필요한 비즈니스 오퍼레이션을 호출한다.
 *  -. 요청 처리 결과에 따라 클라이언트에게 보여줄 뷰를 선택한다.
 * 
 * 서블릿 커뮤니케이션
 * 	-. 서블릿은 다른 서블릿과 커뮤니케이션이 일반 객체와 달리 제약적이다.
 *  	-. 사용자가 서블릿 객체를 직접 생성하지 않는다.
 *  	-. 기본적으로 특정 서비스를 위해 하나의 서블릿 인스턴스를 생성한다.
 *  -. 따라서 요청 처리를 다른 자원으로 위임할 수 있는 방법이 필요하다.
 * 
 * 속성 Scope과 RequestDispatcher
 * 	-. RequestDispatcher인터페이스는 서블릿에서 다른 페이지로 포워드 할 수 있는 메소드를 제공
 *  -. 속성 scope은 다른 서블릿(JSP)과 공유해야 할 데이터를 임시적으로 저장할 수 있는 기능을 제공
 *  -. request, session, application, page
 *  
 *     setAttribute(String name, Object obj)
 *     getAttribute(String name)
 *     
 *     -- 서블릿 --
 *     request.setAttribute("userName", userName);
 *     RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp")
 *     dispatcher.forward(request, response); // 화면은 결과 url은 호출한 쪽의 주소 sendRedirect는 결과쪽 주소
 *     
 *     request.setAttribute("userName", userName);
 *     response.sendRedirect("success.jsp"); // 주소변화, request scope 종료
 *     
 *     -- JSP ---
 *     String userName = (String)request.getAttribute("userName");
 *     
 * <%@ page import="" session="" errorPage="" isErrorPage="" contentType="" pageEncodig=""%>
 *     
 *  request Scope : 요청과 응답사이 
 *  session Scope : ex) 장바구니 / 여러번 호출 
 *  application Scope : ex) 모든 사용자에게 유용하게 사용되어야 하는 데이터 / 계속 있어야 하는 것
 *  page Scope : 잘 쓰지 x, 서블릿에서 안씀 JSP에서 사용
 *  
 *  오전 프로젝트 발표
 *  a : 헬스장 시스템
 *  b : 무인 편의점 POS 시스템
 *  c : 도서 렌탈 시스템
 *  d : 여기 맞줘 맛집 추천?
 *  e : 주차장 정보 안내 시스템
 *  f : 나의 편지 시스템 -> 그림 판매 시스템(지역사회 예술가, 화가 후원 커뮤니티 생성 -> -> 그림 굿즈 생성)
 *  
 *  
 *  비전?
 *  타겟?
 *  사용자?
 *  제공하는 것?
 *  누가 이 시스템을 구입해서 사용하는 가?
 *  주차 +알파 필요 
 *  
 *----------------------------------------2022-07-04------------------------------------------------
 * 자바빈즈(Java Beans)
 * 	Bean이란 재사용과 같은 어떤 목적을 가지고 지정된 규칙에 따라 만들어진 클래스 혹은 컴포넌트 (클래스 -> 재사용 목적으로 만들 때, 빈규약에 따를 때)
 *  규약
 *  	-. 빈은 인자가 없는 생성자를 가져야 한다.
 *  	-. 빈은 프로퍼티에 대한 네이밍 규칙을 준수해야 한다. (ex. setter getter 합친 것 = 프로퍼티)
 *  	-. 설정(setter) 메소드의 아규먼트의 접근(getter)메소드의 리턴타입은 동일해야 한다.
 *  	   public void setName(String name);
 *         public String getName();
 * 		   public void setFemale(boolean female);
 *         public boolean isFemale();
 *      -. 빈의 영속성을 위해 Serializable 또는 Externailizable 인터페이스를 구현할 수 있다.
 *   	-. 캡슐화를 유지한다. method public 멤버변수 private
 * 
 * JSP 표준 액션
 * 		-. JSP는 다양한 표준 액션 태그를 제공한다.
 * 		-. 빈 관련 JSP 표준 액션 태그
 * 			-. 자바 빈즈를 JSP페이지에서 좀 더 쉽게 사용할 수 있도록 제공된 태그
 * 			-. <jsp:useBean>, <jsp:setProperty>, <jsp:getProperty>,
 * 			   <jsp:include>, <jsp:forward>, <jsp:param>
 * 			-. <jsp:useBean id="user"
 * 							class="com.varxyz.jv300.domain.User"
 * 							scope="request" />
 * 				id: 빈속성명, 구분자
 * 				class: 해당 빈에 대한 완전한 클래스명 (추상클래스 x)
 * 				scope: [page(default) | request | session | application]
 *				type: 빈 참조타입(폴리모피즘 적용시 부모타입 명시)
 *
 *				<jsp:useBean id="emp"
 * 							 class="com.varxyz.jv300.domain.Manager"
 * 							 scope="request" />
 * 							 type="com.varxyz.jv300.domain.Employee" />
 * 				
 * 				<jsp:setProperty name="user" property="userId" />
 * 					 name = "자바 빈이름(<jsp:useBean>의 id속성과 동일명)"
 * 					 property= "빈의 set프로퍼티명"
 * 
 * 				case 1)
 * 					<jsp:useBean id="user"
 * 							 class="com.varxyz.jv300.domain.User"
 * 							 scope="request" />
 * 					<jsp:setProperty name="user" property="userId"/>
 * 
 * 				case 2) 신규로 생성될 때만 몸체 처리
 * 			 		<jsp:useBean id="user"
 * 							 class="com.varxyz.jv300.domain.User"
 * 							 scope="request" />
 * 					<jsp:setProperty name="user" property="userId"/>
 * 					</jsp:useBean>
 * 
 * 				<%
 * 					user.setUserId(request.getParameter("userId"));
 * 				%>
 * 				
 * 				<jsp:setProperty name="user" property="userId"
 * 					value="<%= request.getParameter("userId") %>"/>
 * 
 * 				<jsp:setProperty name="user" property="userId" param="userId"/>
 * 				이 때 주의할 것 은 param과 value의 경우 빈타입이 String 또는 Primitive타입
 * 				
 * 				<jsp:setProperty name="user" property="*"/>
 * 
 * 				<jsp:getProperty> 태그
 * 					빈이 가지고 있는 프로퍼티 값을 JSP페이지에 출력할 때 사용
 * 					<jsp:getProperty name="user" property="userId"/>
 * 
 * 				<jsp:include> 태그
 * 					현재 JSP페이지내에 지정된 페이지를 포함시킨다.
 * 					<jsp:include page="/incl/banner.jsp" />
 * 					cf) <%@ include file="..." %>
 * 
 * 				<jsp:include>				<%@include>
 * 				실행시점에 페이지에 포함			변환시점에 페이지에 포함
 *  			수정시 자동 업데이트 제공			수정시 자동 업데이트가 안됨
 *				정적컨텐츠, JSP, CGI포함가능 		정적컨텐츠, JSP만 가능
 *				표현식을 통해 page속성 지정 가능	표현식을 통한 page속성 지정 불가능
 *				매개변수 추가 가능
 *
 * jsp에서는 forward를 잘 안쓰고 servlet에서는 include를 잘 안씀
 * 				
 * 				<jsp:param>
 * 				
 * 				-mypage1.jsp-
 * 				<jsp:include page="header.jsp">
 * 					<jsp:param name="subtitle" value="Welcome to varxyz"/>
 * 				</jsp:include>
 * 				
 * 				-header.jsp-
 * 				<img src="">${param.subtitle}
 * 
 * EL (Expression Language)
 * 		-. Since JSP2.0 스펙에서 EL추가
 * 		-. EL은 크게 두가지 형태로 사용
 * 			-. 커스텀 태그나 액션 태그의 속성값으로 사용
 * 			-. JSP페이지내에서 텍스트 출력시 사용
 *		-. Syntax : ${addr.city}, ${user.userId}
 *
 *		JSP액션태그에서
 *			<jsp:include page="/user/${user.id}/details.jsp"/> => /user/java/details.jsp
 *		HTML 출력시
 *			<h3>Welcome! ${user.userName}님 </h3> => <h3> Welcome 유비님 </h3>
 *		커스텀 태그 속성값으로
 *			<c:set var="name" value="${user.userName}" />
 *
 *		${left.right}
 *			left : EL 내장객체, 자바 빈, Map 중의 하나
 *			right : 빈의 경우 프로퍼티, Map의 경우 key
 *
 *			${user.userId} = ${user["userId"]}
 *			${requestScope.user.userId} // requestScope은 EL 내장객체
 *			// 맵
 *			${nationMap.kr} = ${nationMap["kr"]}
 *			${header.host} = ${header["host"]}
 *			// 배열
 *			${nations[0]} = ${nations["0"]}
 *			// List 처리
 *			=> Servlet
 *				List<String> hobbies = new ArrayList<String>();
 *				hobbies.add("travel");
 *				hobbies.add("drive");
 *				request.setAttribute("hobbies", hobbies);		
 *				
 *				Map<String, String> teachers = new HashMap<String, String>();
 *				teachers.put("java", "유비");
 *
 *				request.setAttribute("hobbies", hobbies);
 *				request.setAttribute("teachers" teachers);
 *	
 *			=> JSP 
 *				Your first hobby is ${hobbies[0]}
 *				Your Java teacher is ${teacher["java"]}
 * EL 내장 객체
 *		-. pageScope / requestScope / sessionScope / applicationScope
 *		-. param ex) ${param.userName}
 *		-. paramValues ex) ${paramValues.fruit[0]}
 *		-. header / headerValues
 *		-. cookie ex) ${cookie.userName.value}
 *				  	=> if(cookie[i].getName().equals("userName")){
 *							out.println(cookie[i].getValue());
 *						}
 *
 * 		-. initParam
 * 		-. pageContext ex) ${pageContext.request.method} = ${requestScope.method}
 * 
 * EL 연산
 * 		-. ${ 1 + 2 * 4 } => 9
 * 		-. ${ "1" + 10 } => 11
 * 		-. ${ null + 1 } => 1
 * 		-. ${ 3 div 4 } => 0.75
 * 		-. ${ 3 / 2 } => 1.5
 * 		-. ${ 32 % 10 } => 2
 * 		-. ==, eq
 * 		-. !=, ne
 * 		-. ${empty someVar}
 * 			 someVar 빈 객체인지 여부를 검사
 * 		     true : null, "", 길이0,
 *  
 * 		-. null값에 대한 EL처리 방법
 * 			-. 속성/프로퍼티가 존재하지 않을 경우 에러 대신 그 부분에 어떤 내용도 출력하지 않는다.
 * 			-. 논리연산에 null값은 false로 처리한다.
 * 		
 * 		-. EL2.2부터 객체의 메소드를 호출할 수 있다.
 * 			${x.doSomething()} => JSP 2.1이전버전에서는 컴파일에러
 * 
 * 		<%
 * 			Calculator calc = new Calculaor();
 * 			request.setAttribute("calc", calc);
 * 		%>
 * 		${calc.setAdd(1, 3)}
 * 		${calc.getAdd()}
 * 
 * JSTL과 커스텀 태그
 * 	 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 * 
 *   JSTL은 표준 태그 라이브러리(Standrad Tag Library)로서 커스텀 태그 중에서
 *   많이 사용하는 것들을 모다 JSTL 규약을 만드었다.
 *
 * 	 JSTL을 사용함으로써 스크립트 코드를 사용할 떄보다 간결하고 이해하기 쉬운
 * 	 JSP코드를 작성할 수 있다.
 * 
 *	 커스텀 태그는 사용자가 직접 개발한 사용자 정의 태그로서 특정 업무나 기능을  가진 태그를 개발자가 직접 커스터마이징 할  수 있다.                                                                                           
 * 
 * 특징
 * 	JSP에서 자바코드를 제거할 수 있다.
 * 	커스텀 태그는 재사용이 가능하다.
 * 	코드에 대한 가독성과 유지보수가 쉽다.
 * 	XML기반의 태그 형식
 * 	다양한 커스텀 태그 라이브러리 제공
 * 
 * JSTL 태그의 종류
 * 	코어라이브러리 : 변수지원, 흐름제어, URL처리 (접두어 : c)
 * 	XML라이브러리 : XML 제어, 변환 (접두어 : x)
 * 	국제화라이브러리 : 지역, 메세지, 숫자, 날짜 형식 (접두어 : fmt)
 * 	데이터베이스라이브러리 : SQL (접두어 : sql)
 * 	함수라이브러리 : 컬렉션, String  처리 (접두어 : fn)
 * 
 * JSTL 코어 라이브러리
 * 	set / if / forEach / url /out
 * 
 * set태그
 * 	EL변수의 값이나 EL변수의 프로퍼티 값을 지정할 때 사용
 * 
 * 	<c:set var="pageTitle">회원가입</c:set>
 * 	
 * 	<html>
 * 		<head><title>${pageTitle}</title></head>
 * 		...
 * 	</html>
 * 
 * if태그
 * 	자바의 if블록과 유사한 기능을 제공한다.
 * 	<c:if test="조건식"> 조건이 참일 경우 실행코드 </c:if>
 * 	<c:if test="${not empty errorMsgs}">에러처리를 여기서 </c:if>
 * 
 * forEach 태그
 * 	배열, 컬렉션, 맵의 데이터를 순차적으로 처리할 때 사용한다.
 * 	<c:forEach var="message" items="${errorMsgs}">
 * 		<li>${message}</li>
 * 	</c:forEach>
 * 
 * 	<c:forEach var="num" begin="1" end="10">
 * 		${num} -> 1부터 10까지 값 출력
 * 	</c:forEach>
 * 
 * url태그
 * 	컨텍스트 경로를 포함한 URL을 생성해 준다.
 * 	value 속성은 절대경로/상대경로 모두 가능
 * 	<form action='<c:url value="add_user.do"/>' method="post">
 * 	<form action='/add_user.do' method="post">
 * 
 * out태그
 * 	-. 데이터를 출력할 때 사용되는 태그로서 특수문자를 변경할 수 있는 기능을 제공한다.
 * 	<c:out value:"${param.email}" default="no email provided" escapeXml="true"/>
 *	<c:out ...>출력내용</c:out>
 *
 * ----------------------------------------2022-07-05-----------------------------------------------
 * web context = servlet context
 * web context는 결국 웹 애플리케이션 그 자체와 동일
 * 웹 애플리케이션이 존재한다는 것은 결국 톰캣이 실행되는 것
 * <웹 컨테이너는 웹 어플리케이션(컨텍스트)이 시작되거나 종료되는 시점에 특정 클래스의 메서드를 실행할 수 있는 기능을 제공하고 있다. 
 * 이 기능을 사용하면 웹 어플리케이션을 실행할 때 필요한 초기화 작업이나 웹 어플리케이션이 종료된 후 사용한 자원을 반환하는 등의
 * 작업을 수행할 수 있다.>
 * 
 * ServletContextEvent를 ServletContextListener가 감지
 * 
 * 유스케이스 목록은 다이어그램으로 대체
 * 
 * ----------------------------------------2022-07-06-----------------------------------------------
 * 수강생 - 강좌
 * 수강생 - 수강신청 - 강좌
 * ex) Student 속성리스트, 오퍼레이션 리스트
 * 도메인
 * 
 * ----------------------------------------2022-07-07-----------------------------------------------
 * 세션 관리( Session Management)
 * 	-. HTTP프로토콜은 stateless 프로토콜
 *  -. 특정 사용자에 대한 상태 정보를 저장해야 할 경우 문제 대두
 *  -. 세션이란 여러 HTTP요청들 간에 특정 클라이언트 정보를 저장 유지하는 메커니즘
 * 	-. 웹 컨테이너 벤더는 세션 유지와 관련된 지원을 반드시 제공 (html의 hidden form 사용 단점은 모든 페이지에 form를 사용해야
 * 	   한다는 것 그래서 나타난 것이 cookie(문자로 만들어진 토큰값))
 * 
 * 세션(Session)
 * 	-. 세션 정보(객체)는 요청 객체로 부터 획득 가능
 *  -. Http session = request.getSession
 *  -  세션 객체는 여러개의 특징 정보를 저장, 검색할 수 있는 메소드를 제공한다
 *     ex) session.setAttribute("myCart" cart);
 * 
 * Session 생성
 * 	HttpSession getSession();
 * 	HttpSession getSession(boolean flag);
 * 
 * Session 제거
 *  void invalidate();	// 서블릿
 *  
 *  <session-config>    // web.xml
 *  	<session-timeout>30</session-timeout>
 *  </session-config>
 *  
 *  쿠키(Cookie)란?
 *   -. 쿠키는 세션을 지원하기 위해 고안된 것으로 일종의 문자 데이터
 *   -. 요청에 대한 응답 과정에서 클라이언트 장치(ex:브라우저)에 저장할 수 있는 정보
 *   -. 클라이언트의 브라우저 종료시 쿠키 정보는 기본적으로 삭제된다.
 *   -. 서버와 클라이언트는 요청-응답 과정에서 쿠키(이름/값)를 교환
 *   -. 콤마, 세미콜론, 공백은 포함할 수 없다.
 *   -. $로 시작할 수 없다.
 *   -. setMaxAge(60 * 30)
 *   -. URLEncoder.encode("서울", " UTF-8")
 *   
 *  forward와 sendredirect 차이
 *  
 * ----------------------------------------2022-07-08-----------------------------------------------
 * 좋은 명세란 개발할 때 계속 보게 되는 명세
 * 
 * ----------------------------------------2022-07-09-----------------------------------------------
 * 1. 프로젝트명
 * 2. 그룹Id : 패키지Id
 * 3. 프로젝트Id
 * 4. [Exential] usecase : 반드시 있어야 한다
 * 5. [High Value] usecase : 이것까지 수행하겠다
 * 6. [Follow] usecase : 할 수 있음 하고 아님 다음으로 넘기겠다
 * 7. [usecase]별 담당자
 * 2022-07-11(월) ~ 2022-07-15(금)
 * 8. 이슈    
 *  
 * ----------------------------------------2022-07-20-----------------------------------------------                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
 * 스프링(Spring) 프레임워크
 * ex) 코비의 다이어리 코비가 제시한 틀안에서 다이어리를 쓰는 것
 * 미리 갖춰진 틀안에서 작업을 하는 것
 * 이 틀 자체로는 의미가 없다
 * 라이브러리는 그 자체로 의미가 있는 것 ex)JDBC
 * 프레임워크는 라이브러리 덩어리
 * 일정 정도 상속 받아서 사용하는 것
 * 우리가 사용한 것 서블릿도 프레임워크
 * 
 * -. Expert One on J2EE Development without EJ8, Rod Johnson
 * -. EJB를 사용하지 않고 엔터프라이즈 애플리케이션 개발 방법 소개
 * -. 스프링은 엔터프라이즈 애플리케이션에서 필요로 하는 기능을 제공하는 프레임워크
 * -. DI, AOP, 트랜잭션, 시큐리티 등의 기능을 제공
 * 
 * 스프링 프레임워크의 특징
 * -. 상대적으로(EJB) 가벼운 JavaEE 컨테이너로 기존 JavaEE 기능 다수를 제공
 * -. POJO 기반으로 작성, 테스트 및 배포가 쉬움
 * -. 다른 프레임워크와의 연동 지원
 * -. 설정 파일 변경만으로도 소스 수정없이 클래스 사이의 새로운 의존 관계 설립
 * 
 * git clone https://github.com/junkiebyte/Spring-MVC-Project.git jvx300
 * 1. https://projectlombok.org/download 다운로드해서
 * 2. jar파일 eclipse 폴더 안에 넣기
 * 3. cmd창 열어서 cd C:\ncs\eclipse
 * 4. java -jar lombok.jar
 * 5. specify location 눌러서 eclipse.exe 선택 후 install
 * 6. import하기 general로
 * 7. help에 eclipse marketplace에서 spring치고 3 다운
 * 8. eclipse restart
 * 9. 서버 켜고 /jv330
 * 
 * asm <--- core < ---beans
 *               < ---expesssion <--next <---transscation
 * 
 * Spring은 필요한 클래스를 bean으로 씀
 * bean등록 시켜놓으면 자동으로 싱글톤처럼 사용
 * 
 * dependency injection (ioc)
 * 싱글톤 같은 패턴이다
 * jsp -> servlet -> service -> dao 이 객체들을 밖에서 xml이 다룸
 * 나중엔 servlet할 때처럼 어노테이션으로 바꿈
 * 
 * 관계 설정만 class에서 하고 나머지는 xml에서 다하기
 * 
 * */