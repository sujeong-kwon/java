package com.varxyz.jv200.mod007;

public class FlyerTest {

	public static void main(String[] args) {
		Flyer f = new Airplane(); // 다형성
//		Flyer f = getFlyer(); 
		/*
		 * 만약 Flyer f = new Car;로 변경해야 할 경우
		 * 1000개의 코드를 변경해야 하는 경우가 발생
		 * 그래서 getFlyer안에 정의해서 필요할 때 꺼내쓸 수 있도록 만드는 것이 좋다
		 */
		f.takeOff();
	}

}
