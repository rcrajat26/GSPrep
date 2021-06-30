package misc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class BestAvg {

    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:\\Users\\Rajat_Chikkodikar\\Desktop\\My files\\Projects\\GSIncubation\\src\\main\\java\\misc\\_scratch");
        Scanner sc = new Scanner(input);

        int entryLen = sc.nextInt();
        String[][] entries = new String[entryLen][2];
        for(int i=0;i<entryLen;i++) {
            String[] s = new String[2];
            s[0] = sc.next();
            s[1] = sc.next();
            entries[i] = s;
        }

        System.out.println(bstAv(entries));
    }

    private static int bstAv(String[][] entry) {
        Map<String,Integer[]> mem = new HashMap<>();
        for(String[] s: entry) {
            String name = s[0];
            Integer score = Integer.parseInt(s[1]);
            if(!mem.containsKey(name)) {
                mem.put(name,new Integer[]{score,1});
            }
            else {
                Integer[] scr = new Integer[2];
                scr[0] = mem.get(name)[0];
                scr[1] = mem.get(name)[1];

                mem.put(name,new Integer[]{score+scr[0],scr[1]+1});
            }
        }
        int high = 0;
        for(Entry<String,Integer[]> e: mem.entrySet()) {
            int av = e.getValue()[0]/e.getValue()[1];
            if(av>high) {
                high = av;
            }
        }

        return high;
    }
}
