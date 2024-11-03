class GameOfThrones1 {
  public static void main(String[] args) {
    String test1 = "aaabbbb";
    System.out.println(gameOfThrones(test1)); // Expected Output: YES

    String test2 = "cdefghmnopqrstuvw";
    System.out.println(gameOfThrones(test2)); // Expected Output: NO

    String test3 = "cdcdcdcdeeeef";
    System.out.println(gameOfThrones(test3)); // Expected Output: YES

    String test4 = "aaaabbbbcccc";
    System.out.println(gameOfThrones(test4)); // Expected Output: YES

    String test5 = "aabbccddeeffg";
    System.out.println(gameOfThrones(test5)); // Expected Output: NO

    String test6 = "abcabcabcabcabcabcabcab";
    System.out.println(gameOfThrones(test6)); // Expected Output: YES

    String test7 = "a";
    System.out.println(gameOfThrones(test7)); // Expected Output: YES

    String test8 = "";
    System.out.println(gameOfThrones(test8)); // Expected Output: YES (Empty string can be considered a palindrome)
}
    public static String gameOfThrones(String s) {
      int[] freq = new int[26];

      for(char c: s.toCharArray()) {
        freq[c - 'a']++;
      }

      int oddCount = 0;
      for(int count: freq) {
        if(count%2 != 0) {
          oddCount++;
        }

        if(oddCount > 1) {
          return "NO";
        }
      }

      return "YES";
    }
}