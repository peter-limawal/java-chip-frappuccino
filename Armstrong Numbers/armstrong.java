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

  public boolean testArmstrong(long num) {

    long length = (long) (Math.log10(num) + 1);
    long testSum = 0;

    for (long i = length; i > 0; i--) {
      long a = num % 10;
      testSum += Math.pow(a, length);
      num -= a;
    }
    
  }

  public static void main(String[] args) {

    Scanner number = new Scanner(System.in);

    System.out.print("Enter test number (Must be integer): ");
    long testNum = number.nextLong();
    decision = number.testArmstrong(testNum);

  }

}
