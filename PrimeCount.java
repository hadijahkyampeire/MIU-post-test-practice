/**
 * 1. Write a function named primeCount with signature 
 int primeCount(int start, int end); 
The function returns the number of primes between start and end inclusive.  
Recall that a prime is a positive integer greater than 1 whose only integer factors are 1 and itself. 
 */

class PrimeCount {

  public static void main(String[] args) {
    System.out.println(primeCount(10, 30));
    System.out.println(primeCount(11, 29));
    System.out.println(primeCount(20, 22));
    System.out.println(primeCount(1, 1));
    System.out.println(primeCount(5, 5));
    System.out.println(primeCount(6, 2));
    System.out.println(primeCount(-10, 6));
  }

  public static int primeCount(int start, int end) {
    int count = 0;
    for(int i = start; i <= end; i++) {
      if (isPrime(i)) {
        count++;
      }
    }
    return count;
  }

  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }

    for(int i = 2; i*i <= num; i++) {
      if (num % i == 0) {
        return false;
      }

    }
    return true;
  }
}