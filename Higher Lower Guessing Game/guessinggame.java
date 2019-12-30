/*
Instructions:
- Create a simple game where the computer randomly selects a number between 1 and 100 and the user has to guess what the number is.
- After every guess, the computer should tell the user if the guess is higher or lower than the answer.
- When the user guesses the correct number, print out a congratulatory message.
  ~ Subgoals:
  ~ Add an introductory message that explains to the user how to play your game.
  ~ In addition to the congratulatory message at the end of the game,
    also print out how many guesses were taken before the user arrived at the correct answer.
  ~ At the end of the game, allow the user to decide if they want to play again (without having to restart the program).
*/
import java.util.*;

public class guessinggame {

  public static void main(String[] args) {
// Creating random number between 1 and 100
    int random = (int) (Math.random() * 100);
    random += 1;
// Introductory message
    System.out.println("The computer has generated a random number between 1 - 100.");
    System.out.println("Your task is to guess what the number is.");
    System.out.println("The computer will indicate if the number you've chosen is higher or lower than the one generated.");
    System.out.println("Happy hunting!");
// To obtain first input
    Scanner input = new Scanner(System.in);
    int guess = input.nextInt();
// Parameters for input
    if (guess >= 1 && guess <= 100) {
// While loop to obtain multiple inputs
      while (guess != random) {
// If guess is higher than random
        if (guess > random) {
          System.out.println("Lower!");
        }
// If guess is lower than random
        else if (guess < random) {
          System.out.println("Higher!");
        }
        guess = input.nextInt();
      }
    }
// Error statement
    else {
      System.out.println("Please input a number between 1 and 100");
    }

  }

}
