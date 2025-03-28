package kr.ac.kopo.day0324;

public class SSTV implements TVI {

	private boolean power;
	private int volumeSize;
	private int channelNo;
	private int volumeTemp;
	private boolean mute = false;
	
	SSTV(){
		power = false;
		volumeSize = 70;
		channelNo = 7;
		System.out.println("SamSungTV가 준비됐어요.");
	}
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		if(power) {
			System.out.println("TV OFF");
		} else {
			System.out.println("TV ON");
		}
		power = !power;
	}

	@Override
	public void channelUP() {
		// TODO Auto-generated method stub
		channelNo = ++channelNo % TVI.MAX_CANNEL;
		System.out.println("channel UP");
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		channelNo = ++channelNo % TVI.MAX_CANNEL;
		System.out.println("channel DOWN");

	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		System.out.println("sound UP");

	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("sound DOWN");

	}

	@Override
	public void mute() {
		if (mute) {
			volumeSize = volumeTemp;
			System.out.println("음소거를 해제합니다.");
		} else {
			volumeTemp = volumeSize;
			volumeSize = 0 ;
			System.out.println("음소거합니다.");
		}
		mute = !mute;
	}

}
