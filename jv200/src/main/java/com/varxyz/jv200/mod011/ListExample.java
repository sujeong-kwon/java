package com.varxyz.jv200.mod011;

import java.util.*;

public class ListExample {
	// 중복 허용, 순서 허용
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("second");
		list.add("3rd");
//		list.add(new Integer(4));
//		list.add(new Float(5.0F));
		list.add("second");
//		list.add(new Integer(4));
//		System.out.println(list);
//		list.add(0, new Integer(42));
//		int total = ((Integer)list.get(0)).intValue();
//		System.out.println(total);
		for(String s: list) {
			System.out.println(s);
		}
		
		for(int i=0; i<list.size(); i++) {
			Object o = list.get(i);
//			String o = list.get(i);
			System.out.println(o);
		}
	}
}
