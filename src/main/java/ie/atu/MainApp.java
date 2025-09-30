package ie.atu;

import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int firstNumber = scan.nextInt();
        System.out.println("Please enter the second number:");
        int secondNumber = scan.nextInt();

        Calculator calc  = new Calculator();
        int result = calc.add(firstNumber, secondNumber);
        System.out.println("the result is:" + result);
    }

}
