package kr.ac.kopo.proffesor.day11;

public class Manager02 extends Employee {

	Employee[] 	empList;	// 관리사원목록
	
	Manager02(int no, String name, String grade, int salary, Employee[] empList) {
		super(no, name, grade, salary);
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







