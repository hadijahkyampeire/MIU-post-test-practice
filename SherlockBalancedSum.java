import java.util.List;

class SherlockBalancedSum {
  public static void main(String[] args) {
    List<Integer> test1 = List.of(1, 2, 3);
    System.out.println(balancedSums(test1)); // Expected Output: NO

    List<Integer> test2 = List.of(1, 2, 3, 3);
    System.out.println(balancedSums(test2)); // Expected Output: YES

    List<Integer> test3 = List.of(1, 1, 4, 1, 1);
    System.out.println(balancedSums(test3)); // Expected Output: YES

    List<Integer> test4 = List.of(2, 0, 0, 0);
    System.out.println(balancedSums(test4)); // Expected Output: YES

    List<Integer> test5 = List.of(0, 0, 2, 0);
    System.out.println(balancedSums(test5)); // Expected Output: YES

    List<Integer> test6 = List.of(1);
    System.out.println(balancedSums(test6)); // Expected Output: YES

    List<Integer> test7 = List.of(1, 2, 3, 4, 3, 2, 1);
    System.out.println(balancedSums(test7)); // Expected Output: YES

    List<Integer> test8 = List.of(1, 2, 3, 4, 5);
    System.out.println(balancedSums(test8)); // Expected Output: NO
}

  public static String balancedSums(List<Integer> arr) {
        long totalSum = 0;
        long leftSum = 0;
        
        for(int num: arr) {
            totalSum = totalSum+num;
        }
        
        for(int num: arr) {
            long rightSum = totalSum - leftSum - num ;
            if(rightSum == leftSum) {
                return "YES";
            }
            leftSum+=num;
        }
        
        return "NO";
    }
}