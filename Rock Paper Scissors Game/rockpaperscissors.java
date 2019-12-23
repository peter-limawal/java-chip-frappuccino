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

  String verdict;
  int comp;

  public void assign(int type) {

    switch (type) {
      case 0:
        comp = "rock";
        break;
      case 1:
        comp = "paper";
        break;
      case 2:
        comp = "scissors";
        break;
    }

  }

  public void battle(String rps) {

    int player;

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

    comp = (int) (Math.random() * 2);

    int x = (player - comp + 3) % 3;

    if (x == 1) {
      verdict = "win";
    }

    else if (x == 2) {
      verdict = "lose";
    }

    else if (x == 0) {
      verdict = "draw";
    }

  }

  public static void main(String[] args) {

    rockpaperscissors object = new rockpaperscissors();

    Scanner choice = new Scanner(System.in);
    String rps = choice.nextLine();
    rps = rps.toLowerCase();

    if (rps == "rock" || rps == "paper" || rps == "scissors") {
      System.out.println("You have chosen: " + rps);

      object.battle(rps);

      System.out.println("Computer has chosen: " + object.assign(comp));
      System.out.println("You have " + verdict);

    else {
      System.out.println("Please select a proper weapon for battle");
      System.out.println("E.g. Rock, Paper, Scissors");
    }

  }

}
