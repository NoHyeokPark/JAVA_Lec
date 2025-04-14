package kr.ac.kopo.day0403;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class LecMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		write();
		read();
		
	}
	
	public static void write() {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream("IOtest/test.txt");
			dos = new DataOutputStream(fos);
			dos.writeChar('A');
			dos.writeInt(12);
			dos.flush();
			
			System.out.println("저장완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dos,fos);
		}
	}
	
	public static void read() {
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("IOtest/test.txt");
			dis = new DataInputStream(fis);
			
			char c = dis.readChar();
			int i = dis.readInt();
			
			System.out.println(c +""+ i);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dis,fis);
		}
	}

}
