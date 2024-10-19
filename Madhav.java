/**
 * A Madhav array has the following property.  
 a[0] = a[1] + a[2] = a[3] + a[4] + a[5] = a[6] + a[7] + a[8] + a[9] = ... 
 The length of a Madhav array must be n*(n+1)/2 for some n. 
Write a method named isMadhavArray that returns 1 if its array argument is a Madhav array, 
otherwise it returns 0. If you are programming in Java or C#  the function signature is 

 int isMadhavArray(int[ ] a) 
If you are programming in C or C++, the function signature is 
 int isMadhavArray(int a[ ], int len) where len is the number of elements in a.

 */

class Madhav {
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
    int len = a.length;
    int n = 0;
    
    // Find n such that n*(n+1)/2 == len
    for (int i = 1; i <= len; i++) {
        if (i * (i + 1) / 2 == len) {
            n = i;
            break;
        }
    }
    
    if (n == 0) {
        // The array length does not match n*(n+1)/2 for any n
        return 0;
    }
    
    int index = 1; // Start from the second element
    int expectedSum = a[0];
    
    // Check the sums of subsequent groups
    for (int i = 2; i <= n; i++) {
        int sum = 0;
        for (int j = 0; j < i; j++) {
            sum += a[index++];
        }
        if (sum != expectedSum) {
            return 0; // Sum does not match a[0]
        }
    }
    
    return 1; // The array is a Madhav array
  }

}