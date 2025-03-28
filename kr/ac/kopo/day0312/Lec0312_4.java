package kr.ac.kopo.day0312;

class Car {                   // public은 파일명과 동일한 클레스에만 붙일 수 있음
	String model;
	int maxSpeed;
	
	
}



public class Lec0312_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car();
		c.model = "람보르기니";
		c.maxSpeed = 999;
		Car c2 = new Car();
		c2.model = "소나타";
		c2.maxSpeed = 250;
		
		System.out.println("첫번째 자동차 모델명 : " + c.model + "\t최대속도 : " + c.maxSpeed);
		System.out.println("첫번째 자동차 모델명 : " + c2.model + "\t최대속도 : " + c2.maxSpeed);
	}

}
