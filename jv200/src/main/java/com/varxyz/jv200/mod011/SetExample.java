package com.varxyz.jv200.mod011;

import java.util.*;

public class SetExample {
	// 중복 x, 순서 x
	// 노란 줄이 뜨는 이유? Generics
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("one");
		set.add("second");
		set.add("3rd");
		set.add(new Integer(4));
		set.add(new Float(5.0F));
		set.add("second"); // 중복(동일 참조)
		set.add(new Integer(4)); 
		System.out.println(set);
	}
}
