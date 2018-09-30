package Conditionals;

import java.util.Scanner;

public class MultiplicationSign {
    public static void Execute() {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        if ((a * b * c) > 0) {
            System.out.println("+");
        }
        else if ((a * b * c) == 0) {
            System.out.println("0");
        }
        else {
            System.out.println("-");
        }
    }
}
