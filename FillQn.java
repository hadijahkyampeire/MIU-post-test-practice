class FillQn {
  public static void main(String[] args) {
    int[] arr1 = {1,2,3,5, 9, 12,-2,-1};
    int[] arr4 = {4, 2, -3, 12};
    int[] arr3 = {2, 6, 9, 0, -3};

    int k1 = 3;
    int n1 = 10;

    int k2 = 1;
    int n2 = 5;
    
    int k3 = 0;
    int n3 = 4;

    printArray(fill(arr1, k1, n1)); // {1,2,3,1,2,3,1,2,3,1}
    printArray(fill(arr4, k2, n2)); // {4, 4, 4, 4, 4}
    printArray(fill(arr3, k3, n3)); // null
 
  }

  public static void printArray(int[] arr) {
    if (arr == null) {
        System.out.println("null");
        return;
    }
    System.out.print("{");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
        if (i < arr.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("}");
  }

  public static int[] fill(int[] a, int k, int n) {
    if(k<1 || n<1) return null;
    int[] newArr = new int[n];
    int count = 0;

    for(int i = 0; i<n; i++) {
      if(count<k) {
        newArr[i] = a[count];
        count++;
      } else if (count == k) {
        count = 0;
        newArr[i] = a[count];
        count++;
      }
    }

    return newArr;
  }
}