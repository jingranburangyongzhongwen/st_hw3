package printPrimes;

public class hw3 {
	static int MAXPRIMES = 3;

	public int[] printPrimes(int n) {
		int curPrime;
		int numPrimes;
		boolean isPrime;
		int[] primes = new int[MAXPRIMES];

		primes[0] = 2;
		numPrimes = 1;
		curPrime = 2;
		while (numPrimes < n) {
			curPrime++;
			isPrime = true;
			for (int i = 0; i <= numPrimes - 1; i++) {
				if (isDivisible(primes[i], curPrime)) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primes[numPrimes] = curPrime;
				numPrimes++;
			}
		}
		/*
		 * for (int i = 0; i <= numPrimes - 1; i++) { 
		 * System.out.println("Prime:" + primes[i]); 
		 * }
		 */
		return primes;
	}

	private static boolean isDivisible(int i, int curPrime) {
		if (curPrime % i == 0) {
			return true;
		}
		return false;
	}

}
