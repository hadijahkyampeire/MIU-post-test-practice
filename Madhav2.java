/**
 * n*(n+1)/2 == length where n is some positive integer, n gets us the groups,
 * a Madhav Array a[0] = a[1]+a[2] = a[3]+a[4]+a[5] etc
 */
class Madhav2 {
  public static void main(String[] args) {
    int[] arr1 = {2, 1, 1};
    int[] arr2 = {2, 1, 1, 4, -1, -1};
    int[] arr3 = {6, 2, 4, 2, 2, 2, 1, 5, 0, 0};
    int[] arr4 = {18, 9, 10, 6, 6, 6};
    int[] arr5 = {-6, -3, -3, 8, -5, -4};
    int[] arr6 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1,  1, -2, -1};
    int[] arr7 = {3, 1, 2, 3, 0};

    System.out.println(isMadhavArray(arr1));
    System.out.println(isMadhavArray(arr2));
    System.out.println(isMadhavArray(arr3));
    System.out.println(isMadhavArray(arr4));
    System.out.println(isMadhavArray(arr5));
    System.out.println(isMadhavArray(arr6));
    System.out.println(isMadhavArray(arr7));
  }

  public static int isMadhavArray(int[] a) {
    if(a.length < 3) return 0;
    int n = 0;

    for(int i = 0; i < a.length; i++) {
      if(i*(i+1)/2 == a.length) {
        n = i;
      }
    }

    if(n == 0) return 0;
    int index = 1;
    int expectedSum = a[0];

    for(int i = 2; i <= n; i++) {
      int sum = 0;
      for(int j = 0; j < i; j++) {
        sum+=a[index++];
      }

      if(expectedSum != sum) {
        return 0;
      }
    }

    return 1;
  }
}