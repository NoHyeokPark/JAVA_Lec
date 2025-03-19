package HomeWork.d0319;

public class Circle extends Diagram {
	
	
	Circle(){
		
	}
	
	Circle(int x){
		super(x);
		setName("원");
	}
	
	void print(Double area) {
		System.out.printf("반지름 %d => %s 넓이 : %.2f\n",x,getName(),area);
	}
	
	void printArea(){
		print(area()*Math.PI);
	}

}