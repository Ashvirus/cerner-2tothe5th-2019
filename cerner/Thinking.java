//cerner_2^5_2019

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Thinking {

	public static void main(String[] args) throws InterruptedException {
			System.out.println("Imagine a number in your mind");
			TimeUnit.MILLISECONDS.sleep(5000);
			System.out.println("Now imagine, if someone gave you the same amount of money, so add it up");
			TimeUnit.MILLISECONDS.sleep(7000);
			Random ran = new Random();
			int n = ran.nextInt(100)+1;
			System.out.println("now, I will give you: "+n+" more, so add it up");
			TimeUnit.MILLISECONDS.sleep(8000);
			System.out.println("Now divide the entire amount by 2");
			TimeUnit.MILLISECONDS.sleep(8000);
			System.out.println("Now, return the money that you took from your friend");
			TimeUnit.MILLISECONDS.sleep(8000);
			System.out.println("You have "+ (float) (n/2.0)+" much left now");
			
	}

}
