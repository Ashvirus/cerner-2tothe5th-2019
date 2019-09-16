//cerner_2^5_2019
import java.math.BigInteger;

public class BiggestPrimeNumber {

	public static void main(String[] args) {
		BigInteger i;
		BigInteger finalPrimeNum = BigInteger.ONE;
		try {
			for (i = BigInteger.valueOf((2 ^ 32) ^ Integer.MAX_VALUE);; i = i.add(BigInteger.ONE)) {
				if (isPrime(i))
					finalPrimeNum = i;
			}
		} catch (Exception e) {
			System.out.println(finalPrimeNum);
		}
	}

	private static boolean isPrime(BigInteger n) {
		if (n.compareTo(BigInteger.ONE) <= 0)
			return false;
		BigInteger i;
		BigInteger half = n.divide(BigInteger.valueOf(2));
		for (i = BigInteger.valueOf(2); i.compareTo(half) <= 0; i = i.add(BigInteger.ONE))
			if (n.mod(i).equals(BigInteger.ZERO))
				return false;
		return true;
	}
}
