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
}
