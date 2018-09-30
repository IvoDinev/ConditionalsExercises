package Conditionals;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        int a;
        a = sc.nextInt();
        if(a <= 0 || a > 9) {
            System.out.println("invalid score");
        }
        else {
            switch ((a - 1) / 3) {
                case 0:
                    a *= 10;
                    break;
                case 1:
                    a *= 100;
                    break;
                case 2:
                    a *= 1000;
                    break;
            }
            System.out.println(a);
        }
    }
}
