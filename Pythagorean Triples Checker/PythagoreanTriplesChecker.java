/*
Instructions:
- Allows the user to input the sides of any triangle in any order.
- Return whether the triangle is a Pythagorean Triple or not.
- Loop the program so the user can use it more than once without having to restart the program.
*/
import java.util.*;

public class PythagoreanTriplesChecker {

  private static boolean checker(int[] sides) {
    if ( ((sides[0]*sides[0]) + (sides[1]*sides[1])) == (sides[2]*sides[2]) )
      return true;
    return false;
  }

  public static void main(String[] args) {
    int[] sides = new int[3];
    boolean repeat = false;

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Use pythagorean triples checker? (yes/no): ");
    String verdict = keyboard.nextLine();

    if (verdict.equalsIgnoreCase("yes"))
      repeat = true;
    else if (verdict.equalsIgnoreCase("no"))
      repeat = false;
    else
      throw new IllegalArgumentException("Answer yes or no!");

    while (repeat) {
      for (int i = 1; i <= 3; i++) {
        System.out.print("Side " + i + ": ");
        sides[i - 1] = Integer.parseInt(keyboard.nextLine());
      }

      Arrays.sort(sides);

      System.out.println("Is a Pythagorean Triple?: " + checker(sides));
      System.out.println("\nUse pythagorean triples checker again? (yes/no): ");
      verdict = keyboard.nextLine();

      if (verdict.equalsIgnoreCase("yes"))
        repeat = true;
      else if (verdict.equalsIgnoreCase("no"))
        repeat = false;
      else
        throw new IllegalArgumentException("Answer yes or no!");
    }

    System.out.print("Goodbye!");
  }
}
