//cerner_2^5_2019
import java.util.Random;
import java.util.Scanner;
public class BlackJack {
	public static void main(String[] args) {
		String[] arr1 = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		String[] arr3 = { "Black Spade", "Red Heart", "Red Diamond", "Black Club" };
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		int score1 = 0, score2 = 0, n1 = 0, n3 = 0, exit = 1;
		while (true) {
			if ((exit == 0 || score1 > 21) && score2 > 16) {
				System.out.println(score1 >= score2 && score1 < 22 ? score1 == score2 ? "It's a draw" : "You Win!!!"
						: "Dealer Won :(");
				break;
			} else if (exit != 0) {
				System.out.println("\nPlease Enter 0 to CLOSE the deal or 1 to play");
				exit = input.nextInt();
				n1 = rand.nextInt(arr1.length);
				n3 = rand.nextInt(arr3.length);
				score1 += exit == 0 ? 0 : n1 > 9 ? 10 : Integer.parseInt(arr1[n1]);
			}
			int d1 = rand.nextInt(5) + 5;
			if (score2 + d1 < 23)
				score2 += d1;
			System.out.println(exit != 0
					? "Your card is: " + arr1[n1] + " " + arr3[n3] + "\nYour current score is: " + score1
							+ "\nDealer score is: " + score2
					: "\nYour current score is: " + score1 + "\nDealer score is: " + score2);
		}
	}
}
