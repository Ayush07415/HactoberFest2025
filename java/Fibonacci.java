//Name- Ayush07415
//Aim- Fibonacci Series with classes
//Date=3/10/2025

import java.util.Scanner;

public class Fibonacci {
    private int n; 

 
    public Fibonacci(int n) {
        this.n = n;
    }


    public void generateSeries() {
        int a = 0, b = 1, c;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();

        Fibonacci fib = new Fibonacci(terms);
        fib.generateSeries();

        sc.close();
    }
}
