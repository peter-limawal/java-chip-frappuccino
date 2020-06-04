/*
Instructions:
- Simulate a magic 8-ball.
- Allow the user to enter their question.
- Display an in progress message(i.e. "thinking").
- Create 20 responses, and show a random response.
- Allow the user to ask another question or quit.
  ~ Bonus:
  ~ Add a gui.
  ~ It must have box for users to enter the question.
  ~ It must have at least 4 buttons:
    1. ask
    2. clear (the text box)
    3. play again
    4. quit (this must close the window)
*/
import java.util.*;

public class MagicEightBall {

  private static String response() {
// Creating ArrayList for possible answers
    ArrayList<String> answers = new ArrayList<String>();
// Affirmative answers
    answers.add("It is certain.");
    answers.add("It is decidedly so.");
    answers.add("Without a doubt.");
    answers.add("Yes, definitely.");
    answers.add("You may rely on it.");
    answers.add("As I see it, yes.");
    answers.add("Most likely.");
    answers.add("Outlook good.");
    answers.add("Yes.");
    answers.add("Signs point to yes.");
// Non-committal answers
    answers.add("Reply hazy, try again.");
    answers.add("Ask again later.");
    answers.add("Better not tell you now.");
    answers.add("Cannot predict now.");
    answers.add("Concentrate and ask again.");
// Negative answers
    answers.add("Don't count on it.");
    answers.add("My reply is no.");
    answers.add("My sources say no.");
    answers.add("Outlook not so good.");
    answers.add("Very doubtful.");
// Return of method with random answer
    return answers.get((int) (Math.random() * answers.size()));
  } // response method

  public static void main(String[] args) {
// To obtain input
    Scanner keyboard = new Scanner(System.in);
// Initial question for input
    System.out.print("Would you like to ask the Magic 8 Ball a question? (Yes/No): ");
    String answer = keyboard.nextLine();
// Creating while loop
    while (answer.equalsIgnoreCase("yes")) {
// Setting variable question as input
      System.out.println("\nTell me...");
      String question = keyboard.nextLine();
// Output printed with the 20 answers
      System.out.println("\nThinking...");
      System.out.println(response());
// Question for another input
      System.out.print("\nPlay another game? (Yes/No): ");
      answer = keyboard.nextLine();
    }
// Output if answer is no
    if (answer.equalsIgnoreCase("no")) {
      System.out.print("See you next time!");
    }
// Output if answer is neither yes/no
    else {
      throw new IllegalArgumentException("ERROR! Please enter a valid answer!");
    }
  }
}
