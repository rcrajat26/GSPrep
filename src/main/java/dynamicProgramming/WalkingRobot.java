package dynamicProgramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WalkingRobot {

    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:\\Users\\Rajat_Chikkodikar\\Desktop\\My files\\Projects\\GSIncubation\\src\\main\\java\\dynamicProgramming\\scratch.txt");
        Scanner sc = new Scanner(input);

        String keys = sc.nextLine();
        int[] pos = move(keys);
        System.out.println(pos[0]+","+pos[1]);
    }

    private static int[] move(String keys) {
        int[] pos = new int[2];

        for(int i=0;i<keys.length();i++) {
            char ch = keys.charAt(i);
            if(ch == 'U') {
                pos[1]++;
            } else if(ch == 'D') {
                pos[1]--;
            } else if(ch == 'L') {
                pos[0]--;
            } else if(ch == 'R') {
                pos[0]++;
            }
        }
        return pos;
    }
}
