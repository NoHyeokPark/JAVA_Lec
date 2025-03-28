package kr.ac.kopo.proffesor.day11;

public class Manager01 extends Employee {

	Employee[] 	empList;	// 관리사원목록
	
	Manager01(int no, String name, String grade, int salary, Employee[] empList) {
//		super();
		this.no = no;
		this.name = name;
		this.grade = grade;
		this.salary = salary;
		this.empList = empList;
	}
	
	void info() {
		super.info();
		
		System.out.println("<<<<  관리사원 리스트 >>>");
		for(Employee e : empList) {
			e.info();
		}
	}
}







