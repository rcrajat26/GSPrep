package dynamicProgramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StairCase {

    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:\\Users\\Rajat_Chikkodikar\\Desktop\\My files\\Projects\\GSIncubation\\src\\main\\java\\dynamicProgramming\\scratch.txt");
        Scanner sc = new Scanner(input);

        int steps = sc.nextInt();
        System.out.println(ways(steps));
    }

    public static int ways(int steps) {
        if(steps<0) return 0;
        else if(steps<2) return 1;

        else {
            return ways(steps-1)+ways(steps-2)+ways(steps-3);
        }
    }
}
