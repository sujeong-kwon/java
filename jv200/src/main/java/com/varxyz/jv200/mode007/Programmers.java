package com.varxyz.jv200.mode007;

public class Programmers {
	public String solution(String s) {
        String answer = "";
        String[] s1 = s.split("");
        for(String x : s1) {
        	System.out.println(x);
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Programmers p = new Programmers();
		System.out.println(p.solution("Zbcdefg"));

	}

}
