/*
Instructions:
- Allows the user to input the sides of any triangle in any order.
- Return whether the triangle is a Pythagorean Triple or not.
- Loop the program so the user can use it more than once without having to restart the program.
*/
import java.util.*;

public class PythagoreanTriplesChecker {

  private static boolean checker(int[] sides) {
// Applying Pythagorean Theorem
    if ( ((sides[0]*sides[0]) + (sides[1]*sides[1])) == (sides[2]*sides[2]) )
      return true;
    return false;
  } // checker method

  public static void main(String[] args) {
// Declaring array for sides
    int[] sides = new int[3];
// Repeat determining variable
    boolean repeat = false;
// To obtain input
    Scanner keyboard = new Scanner(System.in);
// Obtaining verdict input
    System.out.print("Use pythagorean triples checker? (Yes/No): ");
    String verdict = keyboard.nextLine();
// Setting repeat variable depending on verdict
    if (verdict.equalsIgnoreCase("yes"))
      repeat = true;
    else if (verdict.equalsIgnoreCase("no"))
      repeat = false;
// If answer is not yes/no
    else
      throw new IllegalArgumentException("Answer yes or no!");
// While loop
    while (repeat) {
// Filling in array with side lengths
      for (int i = 1; i <= 3; i++) {
        System.out.print("Side " + i + ": ");
        sides[i - 1] = Integer.parseInt(keyboard.nextLine());
      }
// Sort array in ascending order
      Arrays.sort(sides);
// Output
      System.out.println("Is a Pythagorean Triple?: " + checker(sides));
// Reobtaining verdict input
      System.out.print("\nUse pythagorean triples checker again? (Yes/No): ");
      verdict = keyboard.nextLine();
// Resetting repeat variable depending on verdict
      if (verdict.equalsIgnoreCase("yes"))
        repeat = true;
      else if (verdict.equalsIgnoreCase("no"))
        repeat = false;
// If answer is not yes/no
      else
        throw new IllegalArgumentException("Answer yes or no!");
    }
// Final output message
    System.out.print("Goodbye!");
  } // Main method

} // End class
