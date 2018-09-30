package Conditionals;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BiggestOf5 {
    public static void Execute() {
        DecimalFormat df = new DecimalFormat("#.#####");
        Scanner sc = new Scanner(System.in);
        double a, b, c, d, e, temp;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();
        e = sc.nextDouble();
        temp = Math.max((Math.max(a, b)), (Math.max(c, d)));
        if (temp > e) {
            System.out.println(df.format(temp));
        } else if (temp < e) {
            System.out.println(df.format(e));
        } else
            System.out.println(df.format(e));
    }
}
