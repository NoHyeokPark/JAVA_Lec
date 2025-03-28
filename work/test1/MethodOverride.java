package work.test1;

public class MethodOverride extends MethodOver {
	public double areaCircle(double r) {
		System.out.println("자식 객체의 오버라이드 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
