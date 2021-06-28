package dynamicProgramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentElection {

    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:\\Users\\Rajat_Chikkodikar\\Desktop\\My files\\Projects\\GSIncubation\\src\\main\\java\\dynamicProgramming\\scratch.txt");
        Scanner sc = new Scanner(input);

        int studs = sc.nextInt();
        int songLen = sc.nextInt();

        System.out.println(elected(studs,songLen));
    }

    private static int elected(int studs, int songLen) {

        Map<Integer,Integer> mem = new HashMap<>();
        return elect(studs,songLen,mem);
    }

    private static int elect(int studs, int songLen, Map<Integer, Integer> mem) {

        if(mem.containsKey(studs)) {
            return mem.get(studs);
        }
        if(studs==1) {
            return 1;
        }
        else {
            mem.put(studs,elected(studs-1,songLen));
            return (mem.get(studs)+songLen-1)%studs+1;
        }
    }
}
