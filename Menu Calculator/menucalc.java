/*
Instructions:
- Imagine you have started up a small restaurant and are trying to make it easier to take and calculate orders.
- Since your restaurant only sells 9 different items, you assign each one to a number, as shown below.

Chicken Strips - $3.50
French Fries - $2.50
Hamburger - $4.00
Hotdog - $3.50
Large Drink - $1.75
Medium Drink - $1.50
Milk Shake - $2.25
Salad - $3.75
Small Drink - $1.25

- To quickly take orders, your program should allow the user to type in a string of numbers
  and then it should calculate the cost of the order. For example, if one large drink, two small drinks,
  two hamburgers, one hotdog, and a salad are ordered, the user should type in 5993348,
  and the program should say that it costs $19.50. Also, make sure that the program loops so the user can take
  multiple orders without having to restart the program each time.
  ~ Subgoals:
  ~ If you decide to, print out the items and prices every time before the user types in an order.
  ~ Once the user has entered an order, print out how many of each item have been ordered, as well as the total price.
  ~ If an item was not ordered at all, then it should not show up.
*/
import java.util.*;

public class menucalc {

  Double item;
  String reg;

  menucalc(Double menuItem, String regNum) {

    this.item = menuItem;
    this.reg = regNum;

  }

  public static void main(String[] args) {
    
    menucalc chickenStrips = new menucalc(3.50, "1");
    menucalc frenchFries = new menucalc(2.50, "2");
    menucalc hamburger = new menucalc(4.00, "3");
    menucalc hotdog = new menucalc(3.50, "4");
    menucalc largeDrink = new menucalc(1.75, "5");
    menucalc mediumDrink = new menucalc(1.50, "6");
    menucalc milkShake = new menucalc(2.25, "7");
    menucalc salad = new menucalc(3.75, "8");
    menucalc smallDrink = new menucalc(1.25, "9");

  }

}
