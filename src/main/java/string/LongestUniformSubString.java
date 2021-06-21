package string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestUniformSubString {

    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:\\Users\\Rajat_Chikkodikar\\Desktop\\My files\\Projects\\GSIncubation\\src\\main\\java\\string\\_scratch.txt");
        Scanner sc = new Scanner(input);

        String inp = sc.next();
        int[] arr = luss(inp);
        System.out.println("["+arr[0]+" , "+arr[1]+"]");
    }

    private static int[] luss(String inp) {
        int[] range = new int[2];
        range[0] = -1;
        range[1] = -1;

        char currChar = 0;
        int longCharLen = 0, charCnt=0;

        for(int i=0;i<inp.length();i++) {
            if(currChar == 0)
            currChar = inp.charAt(i);

            if(inp.charAt(i) == currChar) {
                charCnt++;
            }
            if(inp.charAt(i) != currChar) {
                if(charCnt>longCharLen) {
                    longCharLen = charCnt;
                    range[1] = i-1;
                    range[0] = i-longCharLen-1;
                    currChar=0;
                    charCnt=0;
                }
            }
        }

        return range;
    }
}
