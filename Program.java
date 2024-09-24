import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int firstNumber = myScanner.nextInt();
    System.out.println("Enter second number: ");
    int secondNumber = myScanner.nextInt();
    int sum = firstNumber + secondNumber; 
    System.out.println("Sum: " + sum);
    int difference = firstNumber - secondNumber; 
    System.out.println("Difference: " + difference);
    int product = firstNumber * secondNumber; 
    System.out.println("Product: " + product);
    double average = (firstNumber + secondNumber) / 2.0; 
   System.out.println("Average: " + average);
     int absoluteValue = Math.abs(firstNumber - secondNumber);
   System.out.println("Distance: " + absoluteValue);
    int maximum = (absoluteValue + firstNumber + secondNumber)/2;
      System.out.println("Maximum: " + maximum);
    int minimum = ((-absoluteValue) + firstNumber + secondNumber)/2;
    System.out.println("Minimum: " + minimum); 
  }
}
//Enter first number: 13
//Enter second number: 20
//Sum: 33
//Difference: -7
//Product: 260
//Average: 16.5
//Distance: 7
//Maximum: 20
//Minimum: 13

