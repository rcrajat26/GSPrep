package mathematics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:\\Users\\Rajat_Chikkodikar\\Desktop\\My files\\Projects\\GSIncubation\\src\\main\\java\\mathematics\\_scratch.txt");
        Scanner sc = new Scanner(input);

        double num = sc.nextDouble();
        System.out.println(sqrt(num));
    }

    private static double sqrt(double num) {
        return Math.sqrt(num);
    }
}
