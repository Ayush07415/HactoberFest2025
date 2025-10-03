//Username= Ayush07415
//Aim= Binary serach tree
//Date=4/10/2025

import java.util.Scanner;

class Factorial {
    private int number;

    public Factorial(int number) {
        this.number = number;
    }


    public long calculate() {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}

public class FactorialMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to calculate factorial: ");
        int n = sc.nextInt();

        Factorial fact = new Factorial(n);
        long result = fact.calculate();

        System.out.println("Factorial of " + n + " is: " + result);

        sc.close();
    }
}

