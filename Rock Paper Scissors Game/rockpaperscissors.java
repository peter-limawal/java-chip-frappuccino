/*
Instructions:
- Create a rock-paper-scissors game.
- Ask the player to pick rock, paper or scissors.
- Have the computer chose its move.
- Compare the choices and decide who wins.
- Print the results.
  ~ Subgoals:
  ~ Give the player the option to play again.
  ~ Keep a record of the score (e.g. Player: 3 / Computer: 6).
*/
import java.util.Scanner;

public class rockpaperscissors {
// Declaring variables for methods
  String verdict;
  int player;
  String result;
// Method to assign rock, paper, or scissors
  public String assign(int type) {
// Switch to convert from int into String rps
    switch (type) {
      case 0:
        result = "rock";
        break;
      case 1:
        result = "paper";
        break;
      case 2:
        result = "scissors";
        break;
    }
// Return statement of method
    return result;

  }
// Method to battle between rock, paper, and scissors
  public String battle(String rps, int comp) {
// Switch to convert String rps into int
    switch (rps) {
      case "rock":
        player = 0;
        break;
      case "paper":
        player = 1;
        break;
      case "scissors":
        player = 2;
        break;
    }
// Rps algorithm
    int x = (player - comp + 3) % 3;
// Switch to determine cases of win, loss, or draw
    switch (x) {
      case 1:
        verdict = "win";
        break;
      case 2:
        verdict = "lose";
        break;
      case 0:
        verdict = "draw";
        break;
    }
// Return statement of method
    return verdict;

  }

  public static void main(String[] args) {
// Creating instance
    rockpaperscissors object = new rockpaperscissors();
// Declaring variables and scanning input
    Scanner choice = new Scanner(System.in);
    String rps;
    int comp;
// Initial question for input
    System.out.println("Play game? (Yes/No)");
    String answer = choice.nextLine();
    answer = answer.toLowerCase();
// While loop for multiple inputs
    while (answer.equals("yes")) {
// Obtain user input rps
      System.out.println("Select a weapon (rock/paper/scissors)");
      rps = choice.nextLine();
      rps = rps.toLowerCase();
// Output statement to identify weapon chosen
      System.out.println("You have chosen: " + rps);
// Random numeric generator
      comp = (int) (Math.random() * 3);
// Output statement for computer-generated weapon and verdict
      System.out.println("Computer has chosen: " + object.assign(comp));
      System.out.println("Verdict: " + object.battle(rps, comp));
// Question for another game
      System.out.println();
      System.out.println("Play another game? (Yes/No)");
      answer = choice.nextLine();
      answer = answer.toLowerCase();
    }
// Output if answer is no
    if (answer.equals("no")) {
      System.out.println("Good game!");
    }

  }

}
