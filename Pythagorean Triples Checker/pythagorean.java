/*
Instructions:
- Allows the user to input the sides of any triangle in any order.
- Return whether the triangle is a Pythagorean Triple or not.
- Loop the program so the user can use it more than once without having to restart the program.
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class pythagorean {

  public Boolean checker(int a, int b, int c) {

    if ( ((a*a) + (b*b)) == (c*c) ) {
      return true;
    }

    else {
      return false;
    }

  }

  public static void main(String[] args) {

    pythagorean triangle = new pythagorean();
    ArrayList<Integer> sides = new ArrayList<Integer>();

    Scanner side = new Scanner(System.in);

    int side1 = side.nextInt();
    sides.add(side1);

    int side2 = side.nextInt();
    sides.add(side2);

    int side3 = side.nextInt();
    sides.add(side3);

    System.out.println("Side 1: " + side1);
    System.out.println("Side 2: " + side2);
    System.out.println("Side 3: " + side3);

    Collections.sort(sides);
    System.out.println(sides);

    side1 = sides.get(0);
    side2 = sides.get(1);
    side3 = sides.get(2);

    System.out.println("Is a Pythagorean Triple?: " + triangle.checker(side1, side2, side3));

  }
}
