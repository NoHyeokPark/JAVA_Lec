package kr.ac.kopo.day0317;

public class Member {
	String name;
	int age;
	char bloodType;
	boolean gender;
	
	Member(){
		this("신원미상");
	}
	Member(String name){
		this(name, 0);
	}
	
	Member(String name, int age){
		this(name, age, true, '?');
	}
	
	Member(String name, int age, boolean gender, char bloodType){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.bloodType = bloodType;
	}

	
	void info() {
		System.out.printf("이름 : %s \n 나이 : %d\n 성별 : %s\n 혈액형 : %c\n\n", name, age, gender ? "남" : "여", bloodType);
	}
}
