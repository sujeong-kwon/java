package com.varxyz.jv200.mod12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		int totalBytes = 0;
		try {
			try {
				fis = new FileInputStream("test.txt");
				fos = new FileOutputStream("test_copy.txt");
				for(int readByte; (readByte = fis.read()) != -1;) {
					fos.write(readByte);
					totalBytes++; // 읽은 byte 수
				}
			}finally {
				fos.close();
				fis.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n전체 바이트 수: " + totalBytes + "bytes.");
	} 

}
