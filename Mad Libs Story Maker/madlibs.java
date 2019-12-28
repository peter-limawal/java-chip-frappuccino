/*
Instructions:
- "Mad Libs consist of a book that has a short story on each page with many key words replaced with blanks.
  Beneath each blank is specified a lexical or other category, such as "noun," "verb," "place," or "part of the body."
  One player asks the other players, in turn, to contribute some word for the specified type for each blank,
  but without revealing the context for that word. Finally, the completed story is read aloud.
  The result is usually comic, surreal and somewhat nonsensical."
- Create a Mad Libs style game, where the program asks the user for certain types of words,
  and then prints out a story with the words that the user inputted.
- The story doesn't have to be too long, but it should have some sort of story line.
- Tip: it's easiest to write out a quick story on a piece of paper or a word document, and then go back through and see which words the user should be able to change.
  ~ Subgoals:
  ~ If the user has to put in a name, change the first letter to a capital letter.
  ~ Change the word "a" to "an" when the next word in the sentence begins with a vowel.
*/
import java.util.*;

public class madlibs {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
// Declaring variables for each input
    String animal1 = input.nextLine();
    String place1 = input.nextLine();
    String name1 = input.nextLine();
    String name2 = input.nextLine();
    String noun1 = input.nextLine();
    String noun2 = input.nextLine();
    String noun3 = input.nextLine();
    String verb1 = input.nextLine();
    String verb2 = input.nextLine();
// Outputting Madlibs story with variables
    System.out.print("Once, there lived a " + animal1 + " named " + name1 + ". ");
    System.out.print("He stayed with his owners, Mr. and Mrs. " + name2 + ". ");
    System.out.print("They pampered " + name1 + " like a " + noun1 + ". ");
    System.out.print("However, " + name1 + " loved " + verb1 + "ing " + noun3 + " clothes and his master and mistress " + verb2 + "ed him for doing so. ");
    System.out.print("One morning, Mr. and Mrs. " + name2 + " had to go to the " + place1 + ". ");
    System.out.print("Before leaving, they put Mr. " + name2 + "' favourite " + noun3 + " " + noun2 + " on the clothesline. ");
    System.out.print("'" + name1 + ", don't " + verb1 + " the " + noun2 + " ,' warned the " + name2 + ". ");
    System.out.print("Once the " + name2 + " left, it began to pour heavily. ");
    System.out.print("'Oh, the " + noun2 + " is getting wet! I must pull it down,' thought " + name1 + ". ");
    System.out.print("However, even before he knew it, he was " + verb1 + "ing the " + noun2 + ". ");
    System.out.print("When the rains stopped, " + name1 + " realised what he had done. ");
    System.out.print("'Oh no,' he thought, 'this time they will throw me out of the house!' ");
    System.out.print("He decided to keep quiet about it. ");
    System.out.print("When the " + name2 + " returned, Mr. " + name2 + " asked, 'Has the wind blown away my " + noun2 + "?' ");
    System.out.print("" + name1 + " promptly nodded. ");
    System.out.print("However, Mrs. " + name2 + " noticed a strand of " + noun3 + " sticking against " + name1 + "' chin. ");
    System.out.print("'Why! It's the " + noun2 + "'s " + noun3 + ",' screamed Mrs. " + name2 + ". ");
    System.out.print("'So you're the culprit,' confirmed Mr. " + name2 + ". ");
    System.out.print("Poor " + name1 + " had to go without his lunch and dinner. ");
    System.out.print("He swore never to " + verb1 + " " + noun3 + " again. ");

  }

}
