package switchcase;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first no. : ");
        int a = sc.nextInt();

        System.out.println("Enter second no. : ");
        int b = sc.nextInt();

        //after integer input we can't take string input directly
        sc.nextLine();

        //we can't take char value in scanner
        System.out.println("Enter operation : ");
        char operation = sc.nextLine().charAt(0);

        int result = 0;

        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            default:
                System.out.println("Invalid operation");
        }

        System.out.println("result is " + result);
    }

}
