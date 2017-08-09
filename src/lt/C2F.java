package lt;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Exercise 3.2
 * Created by Lin Tao on 6/28/2017.
 */
public class C2F {
    public static void main(String[] args) {
        double fDegree = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a number:");
        double cDegree = scan.nextDouble();
        fDegree = ((7 * 9 / 5) + 32);
        DecimalFormat df = new DecimalFormat("#.0");
        String newfDegree ;
        newfDegree = df.format(fDegree);
        System.out.println(cDegree +" C = "+newfDegree+" F");

    }


}
