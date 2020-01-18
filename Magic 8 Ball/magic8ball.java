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

public class magic8ball {
// Method to generate random answers
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
// Return of method
    return answers.get(i);
  }
// Method to generate random number between 0 - 19
  public int random() {
// Defining range
    int max = 19;
    int min = 0;
    int range = max - min + 1;
// Generating numbers
    return (int) (Math.random() * range);
  }

  public static void main(String[] args) {
// Creating instance
    magic8ball object = new magic8ball();
// To obtain input
    Scanner q = new Scanner(System.in);
// Initial question for input
    System.out.println("Would you like to ask the Magic 8 Ball a question? (Yes/No)");
    String answer = q.nextLine();
    answer = answer.toLowerCase();
// Creating while loop
    while (answer.equals("yes")) {
// Setting variable question as input
      String question = q.nextLine();
// Output printed with the 20 answers
      System.out.println("Thinking...");
      System.out.println(object.response(object.random()));
// Question for another input
      System.out.println("\nPlay another game? (Yes/No)");
      answer = q.nextLine();
      answer = answer.toLowerCase();
    }
// Output if answer is no
    if (answer.equals("no")) {
      System.out.println("See you next time!");
    }
  }
}
