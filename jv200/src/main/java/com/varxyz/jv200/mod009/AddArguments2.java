package com.varxyz.jv200.mod009;

public class AddArguments2 {

	public static void main(String[] args) {
		// 1 two 3.0 4 argument
		int sum = 0;
		for(String arg: args) {
			try {
			  sum += Integer.parseInt(arg);
			} catch (NumberFormatException nfe) {
			  System.err.println("[" + arg + "] is not an integer" + "and will not be included in the sum.");
			}
		}
		System.out.println("Sum =" + sum);
	}
}
