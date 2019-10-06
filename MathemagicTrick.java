//based on a Codecademy exercise, this program takes an integer from the user then performs a series of calculations. The number will always be 3, as long as the user gives a number between 1 and 46340. There is a control to make sure this happens - if the user gives a number outside this range, the program ends.

import java.util.Scanner;

public class MathemagicTrick {

  public static void main(String[] args) {

    //introductory message to user
    System.out.println("This program performs a mathemagic trick. First, you'll tell me a number, then I'll perform a calculation. I bet that the result of the calculation is 3, no matter what number you give me.");

    //gets input from user. the number has to be 46340 or under, because the largest possible int value in Java is 2,147,483,647, and the square root of 2,147,483,647 is approx 46340. If you choose a bigger number, step one will result in an integer bigger than Java can cope with.
    Scanner startNumberInput = new Scanner(System.in);
    System.out.println("Type a number greater than 0 but less than 46340.");
    int startNumber = Integer.parseInt(startNumberInput.nextLine());
    boolean startNumberIsNotValid = startNumber <= 0 || startNumber >= 46340;
    if (startNumberIsNotValid) { System.out.println("You gave an invalid number.");
  }
  else {

    //first variable here - the original number (an integer)
    // int myNumber = 4;

    //step one multiplies myNumber by itself
    int stepOne = startNumber * startNumber;

    //step two adds stepone to original number
    int stepTwo = stepOne + startNumber;

    // step three stepTwo / by original number
    int stepThree = stepTwo / startNumber;

    // step four
    int stepFour = stepThree + 17;

    //step five
    int stepFive = stepFour - startNumber;

    //step 6
    int stepSix = stepFive / 6;

    //prints final result - should be 3.
    System.out.println(stepSix);
  }
}

}
