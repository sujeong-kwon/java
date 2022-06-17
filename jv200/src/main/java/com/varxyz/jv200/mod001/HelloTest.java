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
 * */