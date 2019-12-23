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
  int player;
  String result;

  public String assign(int type) {

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

    return result;

  }

  public String battle(String rps, int comp) {

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

    int x = (player - comp + 3) % 3;

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

    return verdict;

  }

  public static void main(String[] args) {

    rockpaperscissors object = new rockpaperscissors();

    Scanner choice = new Scanner(System.in);
    String rps = choice.nextLine();
    rps = rps.toLowerCase();

    System.out.println("You have chosen: " + rps);

    int comp = (int) (Math.random() * 3);

    System.out.println("Computer has chosen: " + object.assign(comp));
    System.out.println("Verdict: " + object.battle(rps, comp));

  }

}
