package ie.atu;

import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Select operator: ");
        String operation = scan.next();

        System.out.println("Please enter the first number:");
        int firstNumber = scan.nextInt();
        System.out.println("Please enter the second number:");
        int secondNumber = scan.nextInt();

        Calculator calc  = new Calculator();
        int result;
        result=switch(operation) {

            case "add" ->{
                yield calc.add(firstNumber, secondNumber);
            }

            case "subtract" -> {
                yield calc.subtract(firstNumber, secondNumber);
            }

            case "multiply" -> {
                yield calc.multiply(firstNumber, secondNumber);
            }
            default ->  {
                System.out.println("Invalid input");
                yield 0;
            }

        };
        System.out.println("the result is: " + result);
    }

}
