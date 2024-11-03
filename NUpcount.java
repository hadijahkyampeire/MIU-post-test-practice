class NUpcount {
  public static void main(String[] args) {
    int[] arr1 = {2, 3, 1, -6, 8, -3, -1, 2};


    System.out.println(nUpcount(arr1, 5));
  }

  public static int nUpcount(int[] a, int n) {
    int count = 0;
    int sum = a[0];

    for(int i = 0; i < a.length - 1; i++) {
      if(sum <= n && sum + a[i+1] > n) {
        count++;
      }

      sum = sum + a[i+1];
    }

    return count;
  }
}