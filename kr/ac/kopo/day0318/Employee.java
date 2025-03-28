package kr.ac.kopo.day0318;

public class Employee {

	int no;
	String name;
	int sal;
	static int employeecnt;
	
	Employee(){}
	
	Employee(int no, String name, int sal){
		this.no = no;
		this.name = name;
		this.sal = sal;
		employeecnt++;
	}
	
	void info() {
		System.out.printf("사번 : %d 사원명 : %s 연봉 : %d\n", no, name, sal);
	}
	
	static void cnt () {
		System.out.println("총 사원수 : " + Employee.employeecnt);
	}
}
