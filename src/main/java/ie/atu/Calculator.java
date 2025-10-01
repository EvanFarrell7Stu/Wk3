package ie.atu;

import java.util.Scanner;

public class Calculator
{
    public int add(int FirstNumber, int SecondNumber) {

        return FirstNumber + SecondNumber;
    }
    //Adds two numbers
    public int subtract(int FirstNumber, int SecondNumber) {
        return FirstNumber - SecondNumber;
    }
    //Subtracts one number from another

    public int multiply(int FirstNumber, int SecondNumber) {
        return FirstNumber * SecondNumber;
    }

    //multiply two numbers

    public int divide(int FirstNumber, int SecondNumber) {

        if(SecondNumber==0){
            Scanner sc = new Scanner(System.in);
            System.out.println("You can't divide by zero");
            System.out.println("Re-enter second number");
            SecondNumber=sc.nextInt();
            return FirstNumber/ SecondNumber;}
        else{
            return FirstNumber / SecondNumber;
        }

    }
    //divide first number by the second


}


