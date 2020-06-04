/*
Instructions:
- Create a program that prints out every line to the song "99 bottles of beer on the wall."
- Do not use a list for all of the numbers, and do not manually type them all in. Use a built in function instead.
- Besides the phrase "take one down," you may not type in any numbers/names of numbers directly into your song lyrics.
- Remember, when you reach 1 bottle left, the word "bottles" becomes singular.
*/
public class NinetyNineBottles {

    public static void main(String[] args) {
// Create for loop, runs 99 times
      for (int bottles = 99; bottles >= 1; bottles--) {

// Special case if 99 bottles, no \n in front
        if (bottles == 99) {
          System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
          System.out.println("Take one down, pass it around, " + (bottles - 1) + " bottles of beer on the wall...");
        }

// General case
        else if (bottles > 2 && bottles < 99) {
          System.out.println("\n" + bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
          System.out.println("Take one down, pass it around, " + (bottles - 1) + " bottles of beer on the wall...");
        }

// Special case if 2 bottles left
        else if (bottles == 2) {
          System.out.println("\n" + bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
          System.out.println("Take one down, pass it around, " + (bottles - 1) + " bottle of beer on the wall...");
        }

// Special case if 1 bottle left
        else if (bottles == 1) {
          System.out.println("\n" + bottles + " bottle of beer on the wall, " + bottles + " bottle of beer.");
          System.out.println("Take one down, pass it around, " + (bottles - 1) + " bottles of beer on the wall...");
        }
      }

// Case when 0 bottles left
      System.out.println("\nNo more bottles of beer on the wall, no more bottles of beer.");
      System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall...");

    }
}
