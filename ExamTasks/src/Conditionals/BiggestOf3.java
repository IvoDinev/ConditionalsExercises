package Conditionals;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BiggestOf3 {
    public static void Execute() {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.######");
        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        if ((a > b) && (a > c)) {
            System.out.println(df.format(a));
        }
        else if ((b > a) && (b > c)) {
            System.out.println(df.format(b));
        }
        else if((c > a) && (c > b)) {
            System.out.println(df.format(c));
        }
        else if((a == b) && (b == c)) {
            System.out.println(df.format(a));
        }
    }
}
