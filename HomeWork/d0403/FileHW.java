package HomeWork.d0403;

import java.util.ArrayList;
import java.util.List;

public class FileHW {

	public static void main(String[] args) {
		Member m = new Member("홍길동", "010-1111-2222", "경기도 성남시 수정구");
		Member m2 = new Member("강길동", "010-4444-5555", "서울특별시 강남구 대치동");
		List<Member> memberList = new ArrayList<>();
		memberList.add(m);
		memberList.add(m2);

		FileClass fc = new FileClass();
		switch (fc.choose()) {
		case 1:
			fc.write(memberList);
			break;
		case 2:
			fc.write2(memberList);
			break;
		case 3:
			fc.read();
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}

	}

}
