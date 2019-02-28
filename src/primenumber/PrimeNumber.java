package primenumber;


/**
 * Write a Java program to check if a given number is prime or not. 
 * Remember, a prime number is a number which is not divisible by
 *  any other number e.g. 3, 5, 7, 11, 13, 17 etc. Be prepared for 
 *  cross e.g. checking till the square root of a number etc.
 * 
 *
 */

/**
 * 
 * there is no need to check till N-1, where N is the number we are checking for primeness,
 *  and checking till square root of N is enough. This reduces a lot of time, especially
 *   while checking a large number is prime or not.
 *
 */
public class PrimeNumber {
	
	public static void main(String[] args) {
		for(int i=2; i<20; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	

	public static boolean isPrime(int number) {
		int sqrt = (int)Math.sqrt(number)+1;
		for(int i=2; i<sqrt; i++) {
			if(number%i==0) {
				return false;
			}
			
		}
		
		return true;
		
			
	}
}
