package com.varxyz.jv200.mode003;

public class PassTest {
	public static void changeInt(int value) {
		value = 55;
	}
	
	public static void changeObjectRef(MyDate ref) {
		ref = new MyDate(1, 1, 2000);
	}
	
	public static void changeObjectAttr(MyDate ref) {
		ref.setDay(4);
	}
	public String solution(String[] seoul) {
        String answer = "";
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
            	answer = "김서방은 " + i + "에 있다";
            	break;
            }
        }
        return answer;
	}
	/*
	public static boolean isSubString(String item, String line) {
		for(int i = 0; i < line.length(); i++) {
			int index = 0;
			if(line.charAt(i) == item.charAt(0) && line.charAt(i+1) == item.charAt(1)) {
				for(int j = 0; j < item.length(); j++) {
					System.out.println("j: " + j + " j.value: " + line.charAt(j + i) + "i: " + i);
					System.out.println(line.charAt(j + i) + "||" + item.charAt(index));
					System.out.println("item.length:" + (item.length() - 1) + " index: " + index + " item.charat(index): " + item.charAt(index));
					if(line.charAt(j + i) != item.charAt(index)) {
						System.out.println(line.charAt(j + i));
						return false;
					}
					System.out.println("index: " + index + "item.leng" + item.length());
					index++;
					if(index == item.length() - 1) {
						return true;
					}

				}				
				index = 0;;
			}
		}
		return true;
	}*/

	/*public static boolean isSubString(String item, String line) {
	      String answer = "";
	      for(int i = 0; i < line.length(); i++) {
	         if(item.length() != 1) {
	            if(line.charAt(i) == item.charAt(0) && line.charAt(i + 1) == item.charAt(1)) {
	               for(int j = 0; j < item.length(); j++) {
	                  if( j + i >= line.length()) {
	                     answer += null;
	                     break;
	                  }
	                  if( item.length() - 1 > line.length() - i) {
	                     return false;
	                  }
	                  answer += line.charAt(j + i);
	               }
	            }            
	         } else if(item.length() == 1) {
	               answer += line.charAt(i);
	               break;
	         }
	      }
	      for(int i = 0; i < answer.length(); i++) {
	         if(answer.charAt(i) != item.charAt(i)) {
	            return false;
	         }
	      }
	      return true;         
	   }*/
	
	public static void main(String[] args) {
		PassTest p = new PassTest();
		String[] seoul = {"jane", "kim"};
		System.out.println(p.solution(seoul));
//		MyDate date;
//		int val;
//		val = 11;
//		changeInt(val);
//		System.out.println("int value is " + val);
//		
//		date = new MyDate(22, 7, 1964);
//		changeObjectRef(date);
//		System.out.println("Mydate is " + date);
//		
//		changeObjectAttr(date);
//		System.out.println("Mydate is " + date);
//		System.out.println(date.toString());
		
		//subString
		String text = "The cat in the hat";
		
		
		//구구단
		/*for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.print(j + " X " + i + " = " + (i * j) + "\t");
			}
			System.out.println();
		}*/
		
		//소수구하기
		/*for(int i = 1; i <= 1000; i++) {
			int result = 0;
			if(i == 1) {
				System.out.println(i);
			}
			for(int j = 2; j <= i; j++) {
				if(i % j == 0) {
					result++;
				}
			}
			if(result == 1) {
				System.out.println(i);
			}
			result = 0;
		}*/
		
		//소수구하기 boolean
		/*for(int i = 1; i <= 10; i++) {
			boolean result = false;
			if(i == 1) {
				System.out.println(i);
			}
			for(int j = 2; j <= i - 1; j++) {
				result = true;
				if(i % j == 0) {
					result = false;
					break;
				}
			}
			if(result) {
				System.out.println(i);
			}
			result = false;
		}*/
		
		
	}
}
