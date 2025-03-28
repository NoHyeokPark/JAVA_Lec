package kr.ac.kopo.day0324;

public interface TVI {

	/* public static final */int MAX_VOLUME = 100;
	int MAX_CANNEL = 9;

	/* public abstract */ void powerOn();

	void channelUP();

	void channelDown();

	void soundUp();

	void soundDown();

	void mute();
}
