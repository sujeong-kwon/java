package com.varxyz.jv200.mod003;

public class RandomTest {

	public static void main(String[] args) {
		/*
		 이모티콘이 종류가 총 7가지가 있다.
		 각각의 이모티콘이 특정 이벤트에서 랜덤하게 화면에 나타난다.
		 이모티콘의 출현 확률이 다음과 같도록 이모티콘 생성기를 작성하라.
		 동그라미(70%) 삼각형(50%) 사각형(30%) 오각형(5%) 육각형(1%) 팔각형(0.5%) 별(0.1%)
		*/
		RandomTest r = new RandomTest();
		System.out.print(r.randomGenerator());
	}
	
	public static String randomGenerator() {
		// 
		String[] array = new String[1566];
		for(int i=0; i<700; i++) {
			array[i] = "동그라미";
		}
		for(int i=700; i<1200; i++) {
			array[i] = "삼각형";
		}
		for(int i=1200; i<1500; i++) {
			array[i] = "사각형";
		}
		for(int i=1500; i<1550; i++) {
			array[i] = "오각형";
		}
		for(int i=1550; i<1560; i++) {
			array[i] = "육각형";
		}
		for(int i=1560; i<1565; i++) {
			array[i] = "팔각형";
		}
		array[1565] = "별";
//		System.out.print(array[1565]);
		int random_num = (int) (Math.random()*1565);
		System.out.println(random_num);
		return array[random_num];
		
	}
	
}
