class IsHollow {
  public static void main(String[] args) {

    int[] arr1 = {1,2,4,0,0,0,3,4,5};
    int[] arr2 = {1,2,0,0,0,3,4,5};
    int[] arr3 = {1,2,4,9, 0,0,0,3,4, 5};
    int[] arr4 = {1,2,0,0,3,4};
    int[] arr5 = {1,2,0,0,3,4,0};

    System.out.println(isHollow(arr1)); // Output: true
    System.out.println(isHollow(arr2)); // Output: false
    System.out.println(isHollow(arr3)); // Output: false
    System.out.println(isHollow(arr4)); // Output: false
    System.out.println(isHollow(arr5)); // Output: false
  }

  public static int isHollow(int[] a) {
    int rightNonZeros = 0;
    int leftNonZeros = 0;
    int zeros = 0;
    int n = a.length;
    int i = 0;

    for(i=0; i<n && a[i] !=0; i++) {
      leftNonZeros++;
    }

    for(; i<n && a[i] == 0; i++) {
      zeros++;
    }

    for(; i<n; i++) {
      if(a[i] == 0) {
        return 0;
      }
      rightNonZeros++;
    }

    if(zeros >= 3 && rightNonZeros == leftNonZeros) {
      return 1;
    }

    return 0;
  }
}