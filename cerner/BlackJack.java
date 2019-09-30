//cerner_2^5_2019
import java.util.Random;
import java.util.Scanner;
public class BlackJack {
	public static void main(String[] args) {
		String[] arr1 = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		String[] arr3 = { "Black Spade", "Red Heart", "Red Diamond", "Black Club" };
		Random rand = new Random();
		int score1 = 0, score2 = 0;
		while (true) {
			System.out.println("Please Enter 0 to CLOSE the deal or just press anything");
			Scanner input = new Scanner(System.in);
			int exit = input.nextInt();
			if (exit == 0 || score1>21) {
				System.out.println(score1 > score2 && score1<22 ? score1==score2? "It's a draw": "You Win!!!" : "Dealer Won :(");
				break;
			}
			int d1 = rand.nextInt(10) + 4;
			int n1 = rand.nextInt(arr1.length);
			int n3 = rand.nextInt(arr3.length);
			System.out.println("Your card is: " + arr1[n1] + " " + arr3[n3]);
			if (n1 > 9)
				score1 += 10;
			else
				score1 += Integer.parseInt(arr1[n1]);
			if (score2 < 18)
				score2 += d1;
			System.out.println("Your current score is: " + score1);
			System.out.println("Dealer score is: " + score2);
		}
	}
}
