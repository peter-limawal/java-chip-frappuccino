public class 99bottles {

    public static void main(String[] args) {

      int bottles = 99;

      for (int i = 99; i >= 1; i--) {
        if (bottles > 1) {
          System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
          bottles--;
          System.out.println("Take one down, pass it around, " + bottles + " bottles of beer on the wall...");
        }

        else if (bottles == 2) {
          System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
          bottles--;
          System.out.println("Take one down, pass it around, " + bottles + " bottle of beer on the wall...");
        }

        else if (bottles == 1) {
          System.out.println(bottles + " bottle of beer on the wall, " + bottles + " bottle of beer.");
          bottles--;
          System.out.println("Take one down, pass it around, " + bottles + " bottles of beer on the wall...");
        }
      }

      System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
      System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall...");

    }
}
