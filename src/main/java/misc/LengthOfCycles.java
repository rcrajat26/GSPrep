package misc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LengthOfCycles {

    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:\\Users\\Rajat_Chikkodikar\\Desktop\\My files\\Projects\\GSIncubation\\src\\main\\java\\misc\\_scratch");
        Scanner sc = new Scanner(input);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int startInd = sc.nextInt();

        System.out.println(cycleLen(arr,startInd));
    }

    private static int cycleLen(int[] arr, int startInd) {

        int cycLen = -1;

        int currInd = startInd;
        boolean dontBreak=true;

        while(dontBreak) {
            currInd = arr[currInd];
            if(currInd == startInd) {
                dontBreak = false;
            }
            cycLen++;
            if(cycLen>arr.length) {
                cycLen = -1;
                break;
            }
        }

        return cycLen+1;
    }
}
