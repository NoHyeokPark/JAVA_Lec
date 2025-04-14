package work.test1;

import java.util.ArrayList;
import java.util.List;

public class testarr {
	
	public static void main (String[] args) {

	List<it> a = new ArrayList<>();
	
	a.add(new it(3,"간다"));
	a.add(new it(7,"sksek"));
	a.add(new it(2,"다다"));
	System.out.println(new it(3,"간다").getClass());
}
}

class it{
	int a;
	String b;
	
	it(){}
	public it(int a, String b) {
		super();
		this.a = a;
		this.b = b;
	}
}