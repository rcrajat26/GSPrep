package string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:\\Users\\Rajat_Chikkodikar\\Desktop\\My files\\Projects\\GSIncubation\\src\\main\\java\\string\\_scratch.txt");
        Scanner sc = new Scanner(input);

        String inp = sc.nextLine();
        System.out.println(reverse(inp));
    }

    private static String reverse(String inp) {
        StringBuilder sb = new StringBuilder(inp);
        return sb.reverse().toString();
    }
}
