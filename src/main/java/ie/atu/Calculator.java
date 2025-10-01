package ie.atu;

import java.util.Scanner;

public class Calculator
{
    public double add(int FirstNumber, int SecondNumber) {//add

        return FirstNumber + SecondNumber;
    }
    //Adds two numbers
    public double subtract(int FirstNumber, int SecondNumber) {//subtract

        return FirstNumber - SecondNumber;
    }
    //Subtracts one number from another

    public double multiply(int FirstNumber, int SecondNumber) {//multiply

        return FirstNumber * SecondNumber;
    }

    //multiply two numbers

    public double divide(int FirstNumber, int SecondNumber) {//divide

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
    public double modulo(int FirstNumber, int SecondNumber) {//modulo

        return FirstNumber % SecondNumber;
    }
    //get remainder/perform modulo operation

    public double power(int FirstNumber, int SecondNumber) {//power
        return Math.pow(FirstNumber, SecondNumber);

    }

}


