package HomeWork.d0403;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kr.ac.kopo.util.FileClose;

public class FileClass {

	public int choose() {
		System.out.println("동작을 선택해주세요 1. 여러줄로 저장 2. 한줄로 저장 3. 출력");
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		sc.nextLine();
		return c;
	}

	public void write(List<Member> memberList) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("IOtest/memberList.txt");
			bw = new BufferedWriter(fw);

			for (Member m1 : memberList) {
				String s = m1.toString();
				int a = s.indexOf(" ");
				bw.write(s.substring(0, a));
				bw.newLine();
				bw.write(s.substring(a + 1, a + 14));
				bw.newLine();
				bw.write(s.substring(a + 15, s.length()));
				bw.newLine();
			}
			System.out.println("저장을 완료하였습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(bw, fw);
		}
	}

	public void write2(List<Member> memberList) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("IOtest/memberList.txt");
			bw = new BufferedWriter(fw);

			for (Member m1 : memberList) {
				String s = m1.toString();
				int a = s.indexOf(" ");
				bw.write(s.substring(0, a));
				bw.write("#");
				bw.write(s.substring(a + 1, a + 14));
				bw.write("#");
				bw.write(s.substring(a + 15, s.length()));
				bw.newLine();
			}
			System.out.println("저장을 완료하였습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(bw, fw);
		}
	}

	public void read() {
		FileReader fr = null;
		BufferedReader br = null;
		List<Member> memberList = new ArrayList<>();
		try {
			fr = new FileReader("IOtest/memberList.txt");
			br = new BufferedReader(fr);
			int i = 0;
			while (true) {
				String data = br.readLine();
				if (data == null)
					break;
				if (data.indexOf("#") == -1) {
					memberList.add(new Member(data, br.readLine(), br.readLine()));
				} else {
					int a = data.indexOf("#");
					int b = 0;
					String name = data.substring(b, a);
					b = a + 1;
					a = data.indexOf("#", b);
					String phone = data.substring(b, a);
					b = a + 1;
					String addr = data.substring(b);
					memberList.add(new Member(name, phone, addr));
				}
			}
			for (Member ml : memberList) {
				System.out.printf("%d번째 맴버\n이름 \t: %s\n전화번호 \t: %s\n주소 \t: %s\n---------------------------------\n",
						++i, ml.getName(), ml.getPhone(), ml.getAddr());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br, fr);
		}
	}

}
