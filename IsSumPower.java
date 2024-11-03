class IsSumPower {
  public static void main(String[] args) {
    int[] arr1 = {8, 8, 8, 8};
    int[] arr2 = {8, 8, 8};

    System.out.println(IsSumPower(arr1)); // Output: true
    System.out.println(IsSumPower(arr2)); // Output: false
  }

  public static boolean IsSumPower(int[] a) {
    int sum = 0;

    if(a == null) return false;
    for(int i =0; i<a.length; i++) {
      sum = sum+a[i];
    }

    if (sum <= 0) {
      return false;
    }

    while(sum % 2 == 0) {
      sum /=2;
    }

    return sum == 1;
  }
}