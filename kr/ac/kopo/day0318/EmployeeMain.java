package kr.ac.kopo.day0318;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee.cnt();
		Employee e1 = new Employee(1, "홍길동", 3000);
		Employee e2 = new Employee(2, "홍길순", 3300);
		
		e1.info();
		e2.info();
		
		Employee.cnt();
	}

}
