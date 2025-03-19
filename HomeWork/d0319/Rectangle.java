package HomeWork.d0319;

public class Rectangle extends Diagram {
	
	
	Rectangle(){
		
	}
	
	Rectangle(int x, int y){
		super(x,y);
		setName("직사각형");
	}
	
	void printArea(){
		print(area());
	}

}