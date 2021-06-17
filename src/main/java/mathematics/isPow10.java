package mathematics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class isPow10 {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:\\Users\\Rajat_Chikkodikar\\Desktop\\My files\\Projects\\GSIncubation\\src\\main\\java\\mathematics\\_scratch.txt");
        Scanner sc = new Scanner(input);

        long num = sc.nextLong();

        System.out.println(isPow(num));
    }

    static boolean isPow(long num) {
        if(num == 1 || num == 10 || num == 100 || num == 1000 || num == 10000|| num == 100000 || num == 1000000 || num == 10000000 || num == 100000000 || num == 1000000000 || num == 10000000000L || num == 100000000000L) {
            return true;
        }
        else {
            if(num%100000000000L == 0) {
                return true;
            }
            else return false;
        }
    }
}
