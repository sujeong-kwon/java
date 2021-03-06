package com.varxyz.jv200.mode004;

public class Imoji {
	public String imojiPer() {
		int circle = 700;
		int tri = 300;
		int square = 50;
		int six = 10;
		int eight = 2;
		int star = 1;
		int total = circle + tri + square + six + eight + star;
		String[] imojiArr = new String[total];
		for(int i = 0; i < imojiArr.length; i++) {
			if(i < circle) {
				imojiArr[i] = "동그라미";
			}
			else if(i >= circle && i < (circle + tri)) {
				imojiArr[i] = "삼각형";
			}
			else if(i >= (circle + tri) && i < (circle + tri + square)) {
				imojiArr[i] = "사각형";
			}
			else if(i >= (circle + tri + square) && i < (circle + tri + square + six)) {
				imojiArr[i] = "육각형";
			}
			else if(i >= (circle + tri + square + six) && i < (circle + tri + square + six + eight)) {
				imojiArr[i] = "팔각형!!";
			}
			else {
				imojiArr[i] = "별!!!!";
			}
		}
		int randomNum = (int) (Math.random() * total);
		return imojiArr[randomNum];
	}
	
}
