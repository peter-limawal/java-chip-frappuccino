/*
Instructions:
- When some people receive change after shopping, they put it into a container and let it add up over time.
  Once they fill up the container, they'll roll them up in coin wrappers which can then be traded in at a bank for what they are worth.
  While most banks will give away coin wrappers for free, it's convenient to have an idea of how many you will need.
  Instead of counting how many coins you have, it's easier to separate all of your coins, weigh them,
  and then estimate how many of each type you have and then how many wrappers you'll need.
  For example, if you weigh all of your dimes and see that you have 1276.9g of them,
  you can estimate that you have about 563 dimes (since each one is 2.268g) and you would be able to fill 11 dime wrappers.
- Allow the user to input the total weight of each type of coin they have (pennies, nickels, dimes, and quarters).
- Print out how many of each type of coin wrapper they would need, how many coins they have, and the estimated total value of all of their money.
  ~ Subgoals:
  ~ Round all numbers printed out to the nearest whole number.
  ~ Allow the user to select whether they want to submit the weight in either grams or pounds.
*/
import java.util.*;

public class coinestimator {

  public static void main(String[] args) {

    Scanner coins = new Scanner(System.in);
// Declaring variables for total weights of each coin
    double wPennies = coins.nextInt();
    double wNickels = coins.nextInt();
    double wDimes = coins.nextInt();
    double wQuarters = coins.nextInt();
// Declaring variables for weights of each type of coin
    double penny = 2.500;
    double nickel = 5.000;
    double dime = 2.268;
    double quarter = 5.670;
// Outputing weight of each type of coin
    System.out.println("Pennies: " + wPennies + "g");
    System.out.println("Nickels: " + wNickels + "g");
    System.out.println("Dimes: " + wDimes + "g");
    System.out.println("Quarters: " + wQuarters + "g");
// Declaring variables for the number of each tupe of coin
    double nPennies = wPennies / penny;
    double nNickels = wNickels / nickel;
    double nDimes = wDimes / dime;
    double nQuarters = wQuarters / quarter;
// Outputting the number of each tupe of coin
    System.out.println("Number of Pennies: " + Math.round(nPennies));
    System.out.println("Number of Nickels: " + Math.round(nNickels));
    System.out.println("Number of Dimes: " + Math.round(nDimes));
    System.out.println("Number of Quarters: " + Math.round(nQuarters));
// Outputting the number of wrappers needed for each type of coin
    System.out.println("Penny Wrappers: " + Math.round(Math.floor(nPennies / 50)));
    System.out.println("Nickel Wrappers: " + Math.round(Math.floor(nNickels / 40)));
    System.out.println("Dime Wrappers: " + Math.round(Math.floor(nNickels / 50)));
    System.out.println("Quarter Wrappers: " + Math.round(Math.floor(nQuarters / 40)));
// Declaring the total amount of money available
    double sum = (Math.round(nPennies) * 0.01) + (Math.round(nNickels) * 0.05) + (Math.round(nDimes) * 0.10) + (Math.round(nQuarters) * 0.25);
// Outputting the total amount of money available
    System.out.println("You own approximately $" + sum);

  }

}
