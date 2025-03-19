package HomeWork.d0319;

import java.util.Random;

public class Area2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		Figma e1 = new Figma(rd.nextInt(8)+2, rd.nextInt(8)+2, "삼각형", 0.5);
		Figma e2 = new Figma(rd.nextInt(8)+2, rd.nextInt(8)+2, "직사각형", 1);
		Figma e3 = new Figma(rd.nextInt(8)+2, "정사각형", 1);
		Figma e4 = new Figma(rd.nextInt(8)+2, "원", Math.PI);
		
		Figma[] figList = {e1, e2, e3, e4};
		FigmaArr m = new FigmaArr(figList);
		m.outPut(m.choose());
	}

}
