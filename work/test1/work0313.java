package work.test1;

public class work0313 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "13";
		String str2 = "24";
		String answer = "";
        for (int i=0; i<str1.length(); i++){
            answer += str1.charAt(i) +"" + str2.charAt(i);
        }
        System.out.println(answer.repeat(3));
	}

}
