package work.test1;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread m = Thread.currentThread();
System.out.println("시작 스레드 이름 : " + m.getName());

Thread a = new Thread();
System.out.println("A : " + a.getName());
a.start();

Thread b = new Thread();
System.out.println("B : " + b.getName());




	}

}
