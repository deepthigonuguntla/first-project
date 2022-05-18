package javaoperators;

public class PrintPrimeNumbersFrom1To100 {

	public static void primenumbers()// a number whitch divided by 1 and itself is called prime number
	{

		String primenumbers = "";
		for (int i = 1; i <= 100; i++) {

			int counter = 0;
			for (int n = i; n >= 1; n--) {

				if (i % n == 0) 
					counter = counter + 1;
				
			}
			if (counter == 2) {
			primenumbers=primenumbers+" "+i;
			}

			// break;when u write 'break' here u get output-->primenumbers
			/*
			 * when u did not write 'break' here u get output-->primenumbers
			 * primenumbers........soon*/
			 }
		System.out.println("prime numbers with in 100 are"+primenumbers);
	}

	public static void main(String[] arg) {
		primenumbers();
		
	}

}
