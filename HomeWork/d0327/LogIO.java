package HomeWork.d0327;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LogIO {
	Scanner sc = new Scanner(System.in);
	List<Member> userDB = new ArrayList<>();

	public LogIO() {
		super();
	}

	String scan(String a) {
		System.out.println(a);
		return sc.nextLine();

	}

	int scanInt(String a) {
		System.out.println(a);
		int b = sc.nextInt();
		sc.nextLine();
		return b;
	}

	void menu() {
		while(true) {
		switch (scanInt("1.회원가입, 2.로그인, 3.비밀번호 변경, 4.회원 조회(관리자) 5.종료")) {
		case 1:
			String id = scan("회원 가입을 시작합니다\n이름을 입력하세요.");
			int pass;
			String e;
			while (true) {
				pass = scanInt("비밀번호를 입력하세요.");
				int passCheck = scanInt("비밀번호를 다시 한번 입력하세요.");
				if (pass == passCheck) {
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다");
				}
			}
			while (true) {
				e = scan("e-mail을 입력하세요.");
				if (e.indexOf("@") != -1) {
					break;
				}
			}
			if (!check(id, pass)) {
				sign(id, pass, e);
				System.out.println("회원가입이 완료되었습니다.");
			} else {
				System.out.println("이미 가입된 회원입니다.");
			}
			break;

		case 2:
			id = scan("이름을 입력하세요.");
			pass = scanInt("비밀번호를 입력하세요.");
			if (check(id, pass)) {
				System.out.println("로그인 되었습니다.");
			} else {
				System.out.println("일치하는 회원정보가 없습니다.");
			}
			break;
		case 3:
			id = scan("이름을 입력하세요.");
			pass = scanInt("비밀번호를 입력하세요.");
			e = scan("이메일을 입력하세요.");
			int checkUser = userDB.indexOf(new Member(id, pass, e));
			if(checkUser != -1) {
			int newPass = scanInt("수정할 비밀번호를 입력하세요.");
			int newPass2 = scanInt("비밀번호 확인 : ");
			if(newPass == newPass2) {
				userDB.get(checkUser).setPassword(newPass);
				System.out.println("비밀번호가 변경되었습니다.");
			} else {
				System.out.println("비밀번호 확인이 일치하지 않습니다.");
			}
			} else {
				System.out.println("회원정보가 일치하지 않습니다.");
			}
			break;
		case 4:
			for (Member m : userDB) {
				System.out.println(m.toString());
			}
			break;
		default :{
			System.exit(0);
		}
		}
		
	}
	}

	void sign(String id1, int password, String email) {
		userDB.add(new Member(id1, password, email));
	}

	boolean check(String id, int password) {
		for (Member m : userDB) {
			if (id.equals(m.getId1()) && password == m.getPassword()) {
				return true;
			}
		}
		return false;
	}

}
