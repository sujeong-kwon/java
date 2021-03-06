package com.varxyz.jv200.mod007;
/*
 * interface
 * - abstract 메소드의 집합, 상수(public)
 * - 인스턴스 생성 불가
 * - 다중 상속 지원
 */
public interface Flyer {
	
	public void fly(); // abstract 안씀, public 생략 가능 
	public void takeOff();
	public void land();
}
