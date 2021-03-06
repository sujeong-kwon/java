package com.varxyz.jv200.mod011;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(Integer.valueOf(1), "유비");
		map.put(new Integer(2), "관우"); // 자바 버전 9이후부턴 사용하지 않는 걸 권장하는 형태
		map.put(3, "장비");
		
		System.out.println(map.get(1));
		
		Set<Integer> set = map.keySet();
		for(Integer integer : set) {
			System.out.print(integer);
			System.out.println(" = " + map.get(integer));
		}
	}
}
