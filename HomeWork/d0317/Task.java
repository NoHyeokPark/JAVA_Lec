package HomeWork.d0317;

public class Task {
	int clock;
	int number;
	
	public Task(int clock, int number){
		this.clock = clock;  //랜덤한 숫자로 입력되는 서비스 타임 값입니다.
		this.number = number;  //Task의 번호입니다.
	}
	
	void excute() {
		for(int i=0;i<clock;i++) {
			System.out.print(number + " ");
		}
	}
}
