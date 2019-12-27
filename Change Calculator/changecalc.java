/*
Instructions:
- Imagine that your friend is a cashier, but has a hard time counting back change to customers.
- Create a program that allows him to input a certain amount of change, and then prints out how many quarters,
  dimes, nickels, and pennies are needed to make up the amount needed.
- Example: if he inputs 1.47, the program will say that he needs 5 quarters, 2 dimes, 0 nickels, and 2 pennies.
  ~ Subgoals:
  ~ So your friend doesn't have to calculate how much change is needed, allow him to type in the amount of money
    given to him and the price of the item. The program should then tell him the amount of each coin he needs like usual.
  ~ To make the program even easier to use, loop the program back to the top so your friend can continue to use
    the program without having to close and open it every time he needs to count change.
*/
import java.util.*;

public class changecalc {

  public int[] separator(Double change) {
// Creating integer Array coins
    int[] coins = {0, 0, 0, 0};
// Declaring variables of US coins
    Double quarters = 0.25;
    Double dimes = 0.10;
    Double nickels = 0.05;
    Double pennies = 0.01;
// While loop for quarters
    while (change >= quarters) {
      change -= quarters;
      coins[0] += 1;
    }
// While loop for dimes
    while (change >= dimes) {
      change -= dimes;
      coins[1] += 1;
    }
// While loop for nickels
    while (change >= nickels) {
      change -= nickels;
      coins[2] += 1;
    }
// While loop for pennies
    while (change >= pennies) {
      change -= pennies;
      coins[3] += 1;
    }
// Return value for method
    return coins;
  }

  public static void main(String[] args) {
// Creating instance
    changecalc object = new changecalc();
// To obtain input
    Scanner input = new Scanner(System.in);
// Initial print message (Instructions)
    System.out.println("Please insert amount of change (in dollars)");
// Setting initial input to variable change
    Double change = input.nextDouble();
// Calling separator method on change
    int[] coins = object.separator(change);
// Creating variables of amount of US coins
    int quarters = coins[0];
    int dimes = coins[1];
    int nickels = coins[2];
    int pennies = coins[3];
// Output message
    System.out.println("You need: " + quarters + " quarter(s), " + dimes + " dime(s), " + nickels + " nickel(s), and " + pennies + " penny(ies)");
  }

}
