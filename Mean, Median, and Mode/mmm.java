/*
Instructions:
- In a set of numbers, the mean is the average, the mode is the number that occurs the most,
  and if you rearrange all the numbers numerically, the median is the number in the middle.
- Create three functions that allow the user to find the mean, median, and mode of a list of numbers.
  If you have access or know of functions that already complete these tasks, do not use them.
  ~ Subgoals
  ~ In the mean function, give the user a way to select how many decimal places they want the answer to be rounded to.
  ~ If there is an even number of numbers in the list, return both numbers that could be considered the median.
  ~ If there are multiple modes, return all of them.
*/
import java.util.*;

public class mmm {

  public int mean(ArrayList<Integer> numbers) {

    int sum = 0;

    for (int i = numbers.size() - 1; i >= 0; i--) {
      sum += numbers.get(i);
    }

    return sum / numbers.size();

  }

  // public int mode(ArrayList<Integer> numbers) {
  //
  // }
  //
  // public int median(ArrayList<Integer> numbers) {
  //
  // }

  public static void main(String[] args) {

    Scanner number = new Scanner(System.in);
// Creating ArrayList<Integer> to hold numbers
    ArrayList<Integer> numbers = new ArrayList<Integer>();
// Introductory message
    System.out.println("Input as many numbers as you want.");
    System.out.println("When finished, press enter. (Type 'done')");
// To obtain input for numbers and adding into ArrayList
    String numS = number.nextLine();
    int num = Integer.parseInt(numS);
    numbers.add(num);
// While loop to add more numbers
    while (numS != "done") {
      numS = number.nextLine();
      if (numS != "done") {
        num = Integer.parseInt(numS);
        numbers.add(num);
      }
    }

  }

}
