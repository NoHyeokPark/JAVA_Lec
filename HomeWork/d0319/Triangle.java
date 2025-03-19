package HomeWork.d0319;

public class Triangle extends Diagram {
	
	
	Triangle(){
		
	}
	
	Triangle(int x, int y){
		super(x,y);
		setName("삼각형");
	}
	
	void printArea(){
		print(area()/2);
	}

}