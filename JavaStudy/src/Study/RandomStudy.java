package Study;

import java.util.Random;

public class RandomStudy {

	public static void main(String[] args) {
		Random random = new Random();
		
		System.out.println(random.nextBoolean());//true or false
		System.out.println(random.nextInt(100));//0~99

		double randomValue = Math.random();
		System.out.println(randomValue);//0.10~0.99
		
		int intValue = (int)(randomValue * 100);
		System.out.println(intValue);//0~99
	}

}
