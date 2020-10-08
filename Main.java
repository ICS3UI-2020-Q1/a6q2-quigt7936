import java.util.Scanner;
/**
 * Search algorithm
 * @author Thomas Quigley
 */
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // declares the array
    int[] numbers = new int[10];

    // gets numbers
    System.out.println("Please enter in 10 integers to put into the array");
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = input.nextInt();
    }
    
    // asks for the number they want to find
    System.out.println("Please enter a number to find");
    int findNumber = input.nextInt();

    // find number and tell the user
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == findNumber) {
        System.out.println(findNumber + " is located at index " + i);
      }
    }
    
  }
}
