package HomeWork.d0319;

public class Square extends Diagram {
	
	
	Square(){
		
	}
	
	Square(int x){
		super(x);
		setName("정사각형");
	}
	
	void printArea(){
		print(area());
	}

}
