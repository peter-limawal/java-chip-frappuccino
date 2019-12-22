/*
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
import java.util.Scanner;
import java.util.ArrayList;

public class magic8ball {

  public String response(int i) {
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
  }

  public static void main(String[] args) {

    Scanner q = new Scanner(System.in);
    String question = q.nextLine();

    System.out.println("Thinking...");
  }
}
