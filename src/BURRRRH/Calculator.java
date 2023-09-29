package BURRRRH;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int result=0;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=Sc.nextInt();
        System.out.println("Enter Second number: ");
        int num2=Sc.nextInt();
        char operators;
        System.out.println("Enter the operator-+,-,*,/");
        operators=Sc.next().charAt(0);

        switch (operators) {
            case '+':
                result = num1 + num2;
                System.out.println("Result is " + result);
                break;
            case '-':
                result=num1-num2;
                System.out.println("Result is "+ result);
                break;
            case'*':
                result=num1*num2;
                System.out.println("Result is "+ result);
                break;
            case'/':
                result=num1/num2;
                System.out.println("Result is "+ result);
                break;
            default:
                System.out.println("Wrong Operator");
                break;

        }



    }
}
