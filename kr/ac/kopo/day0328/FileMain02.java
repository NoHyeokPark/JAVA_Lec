package kr.ac.kopo.day0328;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import kr.ac.kopo.util.FileClose;

public class FileMain02 {

	// 이미지의 복사본 생성
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		long start = System.currentTimeMillis();
		try {
			fis = new FileInputStream("IOtest/Koala.jpg");
			fos = new FileOutputStream("IOtest/Koala3.jpg");
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);

			while (true) {
				int c = bis.read();
				if (c == -1)
					break;
				bos.write(c);
			}
			bos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(bis, fis, bos, fos);
			/*
			if (bis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			*/

		}
		long end = System.currentTimeMillis();
		System.out.println((double) (end - start) / 1000);
	}
}
