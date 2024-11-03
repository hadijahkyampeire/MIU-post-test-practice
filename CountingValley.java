class CountingValley {
  public static void main(String[] args) {
    // Example usage:
    int steps = 8;
    String path = "DDUUUUDD";
    int valleys = countingValleys(steps, path);
    System.out.println("Number of valleys traversed: " + valleys);  // Output: 1
  }

  public static int countingValleys(int steps, String path) {
    int seaLevel = 0;
    int valleys = 0;
    int pathLength = path.length();

    for(int i = 0; i<pathLength; i++) {
      if(path.charAt(i) == 'D') {
        seaLevel--;
      } else {
        seaLevel++;
        if(seaLevel == 0) {
          valleys++;
        }
      }
    
    }
    return valleys;
  }
}