/**
 * Next perfect square returns the first perfect square that is greater than its argument.
 * A perfect square is an integer equal to some integer squared e.g 16 is a perfect square of 4*4
 */

class NextPerfectSquare {
  public static void main(String[] args) {
    System.out.println(nextPerfectSquare(6));
    System.out.println(nextPerfectSquare(36));
    System.out.println(nextPerfectSquare(0));
    System.out.println(nextPerfectSquare(-5));

  }

  public static int nextPerfectSquare(int n) {

    if(n < 0) return 0;
    if(n == 0) return 1;
    
    for(int i = 0; i < n; i++) {
      if((i*i) > n) {
        return i*i;
      }
    }

    return 0;
  }
}