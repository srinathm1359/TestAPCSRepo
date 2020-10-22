public class Demo {
  public static void main(String[] args) {
    int loopNumber = 0;
    if (args.length == 0) {
      loopNumber = 5;
    } else loopNumber = Integer.parseInt(args[0]);
    printLoop(loopNumber);
  }

  public static void printLoop(int loopNumber) {
    for (int i = 0; i < loopNumber; i++) {
      String toPrint = "";
      for (int j = 0; j < loopNumber - i; j++) {
        toPrint += (i+1);
      }
      System.out.println(toPrint);
    }
  }

  public static String arrToString(int[] arr) {
    String toReturn = "{";
    for (int i = 0; i < arr.length; i++) {
      toReturn += arr[i];
      if (i < arr.length - 1) {
        toReturn += ",";
      }
    }
    toReturn += "}";
    return toReturn;
  }

  public static String arrayDeepToString(int[][] arr) {
    String toReturn = "{";
    for (int i = 0; i < arr.length; i++) {
      toReturn += arrToString(arr[i]);
      if (i < arr.length - 1) {
        toReturn += ",\n";
      }
      else toReturn += "}";
    }
    return toReturn;
  }

  public static int[][] create2DArray(int rows, int cols, int maxValue) {
    int[][] toReturn = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        toReturn[i][j] = (int)((maxValue + 1) * Math.random());
      }
    }
    return toReturn;
  }
  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
    int[][] toReturn = new int[rows][];
    for (int i = 0; i < rows; i++) {
      int currentCol = (int)((cols + 1) * Math.random());
      toReturn[i] = new int[currentCol];
      for (int j = 0; j < currentCol; j++) {
        toReturn[i][j] = (int)((maxValue + 1) * Math.random());
      }
    }
    return toReturn;
  }
}
