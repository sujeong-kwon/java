package com.varxyz.jv200.mode004;

import com.varxyz.jv200.mode003.MyDate;

public class ArrayTest {

	public static void main(String[] args) {
		int[] nums = new int[10];
		int[] nums2 = {19, 20, 21, 22};
		int[] nums3 = {1, 2, 5, 6, 3, 4, 7, 10, 9, 8, 12, 12, 15};
		int[] nums4 = {200, 5, 7, 1, 4, 15, 18};
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i+1; 
		}	
		ArrayVerification arr = new ArrayVerification();
//		System.out.println(arr.checkDivision(nums, nums2));
		String[] imojiArr = new String[1066];
		for(int i = 0; i < imojiArr.length; i++) {
			if(i < 700) {
				imojiArr[i] = "동그라미";
			}
			else if(i >= 700 && i <1000) {
				imojiArr[i] = "삼각형";
			}
			else if(i >= 1000 && i < 1050) {
				imojiArr[i] = "사각형";
			}
			else if(i >= 1050 && i < 1060) {
				imojiArr[i] = "육각형";
			}
			else if(i >= 1060 && i < 1065) {
				imojiArr[i] = "팔각형!!";
			}
			else {
				imojiArr[i] = "별!!!!";
			}
		}
		Imoji imo = new Imoji();
		System.out.println(imo.imojiPer());
		
		
	}

}
