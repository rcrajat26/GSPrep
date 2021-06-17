package mathematics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PowerOfExpo {

    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:\\Users\\Rajat_Chikkodikar\\Desktop\\My files\\Projects\\GSIncubation\\src\\main\\java\\mathematics\\scratch.txt");
        Scanner sc = new Scanner(input);

        double base = sc.nextDouble();
        int expo = sc.nextInt();

        double res = power(base,expo);
        System.out.println(res);
    }
    static double power(double base, int expo) {
        double res=1;

        for(int i = 0;i<expo;i++) {
            res *= base;
        }
        return res;
    }
}
