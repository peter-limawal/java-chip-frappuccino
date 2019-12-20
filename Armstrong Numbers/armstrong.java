/*
Instructions:
- Learn about armstrong numbers.
- Define a function that allows the user to check whether a given number is armstrong number or not.
- Hint: To do this, first determine the number of digits of the given number. Call that n. Then take every digit in the number and raise it to the nth power. Add them, and if your answer is the original number then it is an Armstrong number.
- Example: Take 1634. Four digits. So, 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634. So 1634 is an Armstrong number.
- Tip: All single digit numbers are Armstrong numbers.
*/
import java.util.Scanner;

public class armstrong {

  Boolean verdict;

  public Boolean testArmstrong(int num) {

    int initial = num;
    int length = (int) (Math.log10(num) + 1);
    int testSum = 0;

    for (int i = length; i > 0; i--) {
      int a = num % 10;
      testSum += Math.pow(a, length);
      num = (num - a) / 10;
    }

    if (testSum == initial) {
      verdict = true;
    }

    else if (testSum != initial) {
      verdict = false;
    }

    return verdict;

  }

  public static void main(String[] args) {

    Scanner number = new Scanner(System.in);

    int testNum = number.nextInt();
    System.out.println("Test number (Must be integer): " + testNum);

    armstrong test = new armstrong();
    Boolean decision = test.testArmstrong(testNum);

    if (decision == true) {
      System.out.println("The integer " + testNum + " is an Armstrong number");
    }

    else if (decision == false) {
      System.out.println("The integer " + testNum + " is not an Armstrong number");
    }
    
  }

}
