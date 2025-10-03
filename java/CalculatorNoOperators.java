//Username= Ayush07415
//Aim= Binary serach tree
//Date=4/10/2025

import java.util.Scanner;

public class CalculatorNoOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Choose operation: 1) Add 2) Subtract 3) Multiply 4) Divide");
        int choice = sc.nextInt();

        int result = 0;

        switch (choice) {
            case 1: 
                result = Math.addExact(a, b);
                System.out.println("Result: " + result);
                break;
            case 2: 
                result = Math.subtractExact(a, b);
                System.out.println("Result: " + result);
                break;
            case 3: 
                result = Math.multiplyExact(a, b);
                System.out.println("Result: " + result);
                break;
            case 4: 
                result = Math.floorDiv(a, b);
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
    
}
