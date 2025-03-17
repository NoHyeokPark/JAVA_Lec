package HomeWork.d0317;

import java.util.Random;

public class Day0317HW01 {

	public static void main(String[] args) {
		Random r = new Random();
		Task[] workLoad = new Task[3];                 // 1,3,5초가 아닌 임의의 숫자 3개를 뽑아와서 Task에 배정하도록 하였습니다.
		for (int i = 0; i < 3; i++) {
			workLoad[i] = new Task(r.nextInt(9) + 1, i+1);
		}
		System.out.printf("Task 3개의 작업량\n1번 %d\n2번 %d\n3번 %d\n***SJF로 실행합니다.***\n",workLoad[0].clock, workLoad[1].clock,workLoad[2].clock);
		System.out.println("1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 <-시간 흐름\n--------------------------------------------------");
		if(workLoad[0].clock <= workLoad[1].clock) {
			if(workLoad[0].clock <= workLoad[2].clock) {
				if(workLoad[1].clock <= workLoad[2].clock) {
					workLoad[0].excute();
					workLoad[1].excute();
					workLoad[2].excute();
					
				} else {
					workLoad[0].excute();
					workLoad[2].excute();
					workLoad[1].excute();
					
				}
			} else {
				workLoad[2].excute();
				workLoad[0].excute();
				workLoad[1].excute();
				
			}
		} else if (workLoad[1].clock <= workLoad[2].clock){
			if(workLoad[0].clock <= workLoad[2].clock) {
				workLoad[1].excute();
				workLoad[0].excute();
				workLoad[2].excute();
				
			} else {
				workLoad[1].excute();
				workLoad[2].excute();
				workLoad[0].excute();
				
			}
		} else {
			workLoad[2].excute();
			workLoad[1].excute();
			workLoad[0].excute();
			
		}
		System.out.println(" //**모든 Task 실행 완료**");
	}

}
