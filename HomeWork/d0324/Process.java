package HomeWork.d0324;

public class Process {
	int pid;
	int burstTime;
	int waitingTime;
	int turnaroundTime;

	public Process(int pid, int burstTime){
		this.pid = pid;
		this.burstTime = burstTime;
	}
}
