package kr.ac.kopo.day0324;

public class LGTV implements TVI {

	private boolean onOff;
	private int volumeSize;
	private int channelNo;
	private int volumeTemp;

	public LGTV() {
		onOff = false;
		volumeSize = 40;
		channelNo = 3;
		System.out.println("LGTV가 준비됐어요.");
	}

	void volumeView() {
		for (int i = 0; i < 100; i += 10) {
			if (i == volumeSize-10) {
				System.out.print("|");
			} else {
				System.out.print("-");
			}
		}
		System.out.println();
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		if (onOff) {
			onOff = false;
			System.out.println("TV전원을 끕니다.");
		} else {
			onOff = true;
			System.out.println("TV전원을 켭니다.");
		}
	}

	@Override
	public void channelUP() {
		// TODO Auto-generated method stub
		if (channelNo < TVI.MAX_CANNEL) {
			channelNo++;
		} else {
			channelNo = 1;
		}
		System.out.printf("현재 채널 %d번 입니다.\n", channelNo);

	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		if (channelNo > 1) {
			channelNo--;
		} else {
			channelNo = TVI.MAX_CANNEL;
		}
		System.out.printf("현재 채널 %d번 입니다.\n", channelNo);
	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		if (volumeSize < TVI.MAX_VOLUME) {
			volumeSize += 10;
		}
		volumeView();
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		if (volumeSize > 0) {
			volumeSize -= 10;
		}
		volumeView();
	}

	@Override
	public void mute() {
		// TODO Auto-generated method stub
		if (volumeSize != 0) {
			volumeTemp = volumeSize;
			volumeSize = 0;
			System.out.println("Mute On");
		} else {
			volumeSize = volumeTemp;
			System.out.println("Mute Off");
			volumeView();

		}
	}

}
