package kr.ac.kopo.proffesor.day11;

public class ExtendsMain02 {

	public static void main(String[] args) {
		
		Employee e = new Employee(100, "홍길동", "사원", 3_000);
		Employee e2 = new Employee(101, "강길동", "사원", 3_200);
		Employee e3 = new Employee(102, "윤길동", "대리", 3_600);
		Employee e4 = new Employee(103, "김길동", "대리", 3_800);
		Employee e5 = new Employee(104, "고길동", "과장", 4_500);
		
		e.info();
		e2.info();
		e3.info();
		e4.info();
		e5.info();
		
		Employee[] empList = {e, e2, e4};
//		Manager m = new Manager(10, "나최고", "부장", 9_900, empList);
//		Manager01 m = new Manager01(10, "나최고", "부장", 9_900, empList);
		Manager02 m = new Manager02(10, "나최고", "부장", 9_900, empList);
		
		m.info();
		
	}
}
