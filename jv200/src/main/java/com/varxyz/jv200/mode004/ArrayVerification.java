package com.varxyz.jv200.mode004;

public class ArrayVerification {
	public String checkDivision(int[] nums, int[] target) {
		String answer = "";
		int numLastLeng = nums.length - 1;
		int targetLastLeng = target.length - 1;
		if(nums[numLastLeng] >= target[targetLastLeng]) {
			answer = "포함";
		}
		else if(nums[numLastLeng] >= target[0] && nums[numLastLeng] <= target[targetLastLeng]) {
			answer = "부분겹침";
		}
		else if(nums[numLastLeng] < target[0]) {
			answer = "떨어짐";
		}
		return answer;
	} 
	public String checkRandom(int[] nums, int[] target) {
		String answer = "";
		for(int i = 0; i < nums.length; i++) {
			int startNum = nums[i];
			int temp = 0;
			for(int j = i + 1; j < nums.length; j++) {
				if(startNum > nums[j]) {
					temp = startNum;
					startNum = nums[j];
					nums[i] = nums[j];
					nums[j] = temp; 
				}
			}
		}
		for(int i = 0; i < target.length; i++) {
			int startNum = target[i];
			int temp = 0;
			for(int j = i + 1; j < target.length; j++) {
				if(startNum > target[j]) {
					temp = startNum;
					startNum = target[j];
					target[i] = target[j];
					target[j] = temp; 
				}
			}
		}
		int numLastLeng = nums.length - 1;
		int targetLastLeng = target.length - 1;
		if(nums[numLastLeng] >= target[targetLastLeng]) {
			answer = "포함";
		}
		else if(nums[numLastLeng] >= target[0] && nums[numLastLeng] <= target[targetLastLeng]) {
			answer = "부분겹침";
		}
		else if(nums[numLastLeng] < target[0]) {
			answer = "떨어짐";
		}
		return answer;
	}
}
