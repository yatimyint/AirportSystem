package travelers;

import java.util.Scanner;


public class BaggageWeightCheck {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your baggage weight: ");
    int weight = (int) input.nextDouble(); // implicit casting

    if (weight <= 40) {
      System.out.println("Your baggage is approved.");
    } else {
      System.out.println("Overweight, please pay the fine, or remove the additional weight.");
    }
  }

}
