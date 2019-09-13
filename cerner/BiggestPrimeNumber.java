//cerner_2^5_2019
import java.math.BigInteger;

public class BiggestPrimeNumber {

	public static void main(String[] args) {
		printPrime();
	}

	private static boolean isPrime(BigInteger n) {
		if (n.compareTo(BigInteger.ONE) <= 0)
			return false;
		BigInteger i;

		BigInteger sqrt = n.pow(1 / 2);
		for (i = BigInteger.valueOf(2); i.compareTo(sqrt) <= 0; i = i.add(BigInteger.ONE))
			if (n.mod(i).equals(BigInteger.ZERO))
				return false;

		return true;
	}

	private static void printPrime() {
		BigInteger i;
		for (i = BigInteger.valueOf((2 ^ 32) ^ Integer.MAX_VALUE);; i = i.add(BigInteger.ONE)) {
			if (isPrime(i))
				System.out.println(i);
		}
	}
}
