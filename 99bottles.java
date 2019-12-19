/*
Instructions:
- Create a program that prints out every line to the song "99 bottles of beer on the wall."
- Do not use a list for all of the numbers, and do not manually type them all in. Use a built in function instead.
- Besides the phrase "take one down," you may not type in any numbers/names of numbers directly into your song lyrics.
- Remember, when you reach 1 bottle left, the word "bottles" becomes singular.
*/
public class 99bottles {

    public static void main(String[] args) {
// Declare variable bottles
      int bottles = 99;
        
// Create for loop, runs 99 times
      for (int i = 99; i >= 1; i--) {
          
// Special case if 99 bottles, no \n in front 
        if (bottles == 99) {
          System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
          bottles--;
          System.out.println("Take one down, pass it around, " + bottles + " bottles of beer on the wall...");
        }
          
// General case
        if (bottles > 2 && bottles != 99) {
          System.out.println("\n" + bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
          bottles--;
          System.out.println("Take one down, pass it around, " + bottles + " bottles of beer on the wall...");
        }
          
// Special case if 2 bottles left
        else if (bottles == 2) {
          System.out.println("\n" + bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
          bottles--;
          System.out.println("Take one down, pass it around, " + bottles + " bottle of beer on the wall...");
        }
          
// Special case if 1 bottle left
        else if (bottles == 1) {
          System.out.println("\n" + bottles + " bottle of beer on the wall, " + bottles + " bottle of beer.");
          bottles--;
          System.out.println("Take one down, pass it around, " + bottles + " bottles of beer on the wall...");
        }
      }
        
// Case when 0 bottles left
      System.out.println("\nNo more bottles of beer on the wall, no more bottles of beer.");
      System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall...");

    }
}
