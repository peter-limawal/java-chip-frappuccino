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

    ArrayList<Integer> sequence = new ArrayList<Integer>();
    Scanner input = new Scanner(System.in);

    System.out.println("Enter n");
    int n = input.nextInt();
    int x = 0;
    int y = 1;

    for (int i = n; i > 0; i--) {
      int z = x + y;
      x = y;
      y = z;

      sequence.add(x);
    }

    System.out.println(sequence);
    System.out.println("Term number " + n + " in the fibonacci sequence is: " + x);

  }

}
