package HomeWork.d0319;

public class Figma {
	String name;
	int x;
	int y;
	double spc;

	Figma() {
	}

	Figma(int r, String name, double spc) {
		setX(r);
		setY(r);
		setName(name);
		setSpc(spc);
	}
	
	Figma(int r, int r2, String name, double spc){
		setX(r);
		setY(r2);
		setName(name);
		setSpc(spc);
	}
	
	double area () {
		return spc*x*y;
	}

	public String getName() {
		return name;
	}
	
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getSpc() {
		return spc;
	}

	public void setSpc(double spc) {
		this.spc = spc;
	}

	public void setName(String name) {
		this.name = name;
	}
}
