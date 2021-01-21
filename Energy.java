import java.lang.Math;
import java.util.Scanner;

/**
* The Energy program implements an application that
* determines the amount of energy that can be released
* from an object of a certain mass.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-01-20 
*/
public class Energy {
  /**
  * The Energy program implements an application that
  * determines the amount of energy that can be released
  * from an object of a certain mass.
  */
  public static void main(String[] args) {
    double mass = 0;
    while (true) {
      try {
        // Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the mass of the object (kg): ");
        mass = input.nextDouble();
        if (mass > 0) {
          break;
        }
      } catch (Exception e) {
        System.out.printf("That is not a number, please input a number!");
      }
    }
    // Process
    double energy = mass * Math.pow(299792458.0, 2.0);

    // Output
    System.out.printf("That object could release %7.4e Joules of energy.", new Object[] {energy});
  }
}
