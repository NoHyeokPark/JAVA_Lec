package kr.ac.kopo.day0319;

public class Manager extends Employee {

	int a;
	int b;
	int c;

	Manager() {
	}

	public Manager(int no, String name, String grade, int salary, int a, int b, int c) {
		super(no, name, grade, salary);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}
