package kr.ac.kopo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import kr.ac.kopo.util.FileClose;

public class a extends FileClose{
	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			
			fr = new FileReader("IOtest/WrapperMain.java");
			br = new BufferedReader(fr);
			
			fw = new FileWriter("IOtest/WrapperMain.java.txt");
			bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				pw.println(data);
			//	bw.write(data);
			//	bw.newLine();
			}
			System.out.println("저장을 완료하였습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br, fr);
			FileClose.close(bw, fw);
		}
		
	}
}
