package Conditionals;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sort3Numbers {
    public static void Execute() {
    DecimalFormat df = new DecimalFormat("#.#####");
    Scanner sc = new Scanner(System.in);
    int a, b, c, first;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
        if((a > b) && (a > c)) {
        if(b >= c) {
            System.out.println(a + " " + b + " " + c );
        }
        else
            System.out.println(a + " " + c + " " + b);
    }
        else if((b > a) && (b > c)) {
        if(a >= c) {
            System.out.println(b + " " + a + " " + c );
        }
        else
            System.out.println(b + " " + c + " " + a);
    }
        else if((c > a) && (c > b)) {
        if(a > b) {
            System.out.println(c + " " + a + " " + b);
        }
        else
            System.out.println(c + " " + b + " " + a);
    }
        else if(a == b) {
        if(b >= c) {
            System.out.println(a + " " + b + " " + c);
        }
        else
            System.out.println(c + " " + a + " " + b);
    }
        else if(b == c) {
        if(c >= a) {
            System.out.println(b + " " + c + " " + a);
        }
        else
            System.out.println(a + " " + c + " " + b);
    }
        else if(a == c) {
            if (c >= b) {
                System.out.println(a + " " + c + " " + b);
            } else
                System.out.println(b + " " + c + " " + a);
        }
    }
}
