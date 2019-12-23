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

  public Boolean battle(String rps) {

    int player;

    if (rps = "rock") {
      player = 0;
    }

    else if (rps = "paper") {
      player = 1;
    }

    else if (rps = "scissors") {
      player = 2;
    }

    int comp = (int) (Math.random() * 2);

    if (comp == 0) {

    }

  }

  public static void main(String[] args) {

    Scanner choice = new Scanner(System.in);
    String rps = choice.nextLine();
    rps = rps.toLowerCase();

    if (rps == "rock" || rps == "paper" || rps == "scissors") {
      System.out.println("You have chosen: " + rps);
    }

    else {
      System.out.println("Please select a proper weapon for battle");
    }

  }

}
