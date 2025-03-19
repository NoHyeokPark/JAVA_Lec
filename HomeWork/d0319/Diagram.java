package HomeWork.d0319;

public class Diagram {

	String name;
	int x;
	int y;

	Diagram() {
	}

	Diagram(int r) {
		this.x = r;
		this.y = r;
	}
	
	Diagram(int r, int r2){
		this.x = r;
		this.y = r2;
	}
	
	int area () {
		return x*y;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	void print(int area) {
		System.out.printf("가로 %d, 세로 %d => %s 넓이 : %d\n",x,y,getName(),area);
	}

}
