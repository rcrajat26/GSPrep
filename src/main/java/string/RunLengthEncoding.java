package string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RunLengthEncoding {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:\\Users\\Rajat_Chikkodikar\\Desktop\\My files\\Projects\\GSIncubation\\src\\main\\java\\string\\_scratch.txt");
        Scanner sc = new Scanner(input);

        String inp = sc.next();

        String op = rle(inp);
        System.out.println(op);
    }

    private static String rle(String inp) {
        StringBuffer sb = new StringBuffer();
        char currChar=0;
        int charLen=0;
        for(int i=0;i<inp.length();i++) {

            if(currChar == 0) {
                currChar = inp.charAt(i);
                charLen = 1;
                if(i==inp.length()-1) {
                    sb.append(currChar);
                    sb.append(charLen);
                }

            } else if(inp.charAt(i) == currChar) {
                charLen++;
                if(i==inp.length()-1) {
                    sb.append(currChar);
                    sb.append(charLen);
                }
            } else {
                sb.append(currChar);
                sb.append(charLen);
                currChar=inp.charAt(i);
                charLen=1;
            }
        }
        return sb.toString();
    }
}
