package lang.print.gaps.task4;

import java.util.Scanner;

public class FormulaCreator {
    public static void main(String[] args) {
        int a,b;
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        double c=(9 * a * a - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2);
    }
}
