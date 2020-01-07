/*
Instructions:
- Define a function that allows the user to find the value of the nth term in the sequence.
- To make sure you've written your function correctly, test the first 10 numbers of the sequence.
- You can assume either that the first two terms are 0 and 1 or that they are both 1.
- There are two methods you can employ to solve the problem. One way is to solve it using a loop and the other way is to use recursion.
- Try implementing a solution using both methods.
*/
import java.util.*;

public class fibonacci {

  public static void main(String[] args) {
// Creating ArrayList to print sequence
    ArrayList<Integer> sequence = new ArrayList<Integer>();
    Scanner input = new Scanner(System.in);
// To obtain input
    System.out.println("Enter n:");
    int n = input.nextInt();
// Input parameters
    if (n > 0) {
// Setting variables
      int x = 0;
      int y = 1;
// For loop to obtain fibonacci
      for (int i = n; i > 0; i--) {
        int z = x + y;
        x = y;
        y = z;
// Adding the final value of x from each loop to ArrayList
        sequence.add(x);
      }
// Final output printed
      System.out.println(sequence);
      System.out.println("Term number " + n + " in the fibonacci sequence is: " + x);
    }
// Else if input is wrong
    else {
      System.out.println("Please input a valid 'n' value! (Positive integers)");
    }

  }

}
