package com.varxyz.jv200.mod003;

public class ArrayTest {

	public static void main(String[] args) {
		ArrayTest a = new ArrayTest();
		System.out.println(a.arrayTest());
	}
	
	public String arrayTest() {
		int[] nums = new int[] {1, 2, 3, 4, 5};
		int[] target = new int[] {6, 9, 2};
		String status = null;
		int check = 0;
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<target.length; j++) {
//				if(nums[i]==target[j]) {
//					status = "중복";
//				}else {
//					status = "중복x";
//				}
				if(nums[i]==target[j]) {
					check++;
					System.out.println(check);
				}
				if(check == nums.length) {
					status = "겹침";
				}else if(0 < check && check < nums.length) {
					status = "걸침";
				}else if(check == 0){
					status = "배제";
				}
			}
		}
		return status;
	}
}
