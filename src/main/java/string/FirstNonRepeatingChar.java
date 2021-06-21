package string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Map.Entry;

public class FirstNonRepeatingChar {

    public static void main(String[] args) throws FileNotFoundException {

        File input = new File("C:\\Users\\Rajat_Chikkodikar\\Desktop\\My files\\Projects\\GSIncubation\\src\\main\\java\\string\\_scratch.txt");
        Scanner sc = new Scanner(input);

        String inp = sc.next();
        char nrc = nonRepeatingChar(inp);
        System.out.println(nrc);
    }

    private static char nonRepeatingChar(String inp) {
        char nrc='0';
        char[] inpChars = inp.toCharArray();

        Map<Character,Integer> occurred = new LinkedHashMap<>();
        for(Character ch:inpChars) {
            if(occurred.containsKey(ch)) {
                occurred.put(ch,occurred.get(ch)+1);
            }
            else {
                occurred.put(ch,1);
            }
        }

        for(Entry<Character,Integer> e:occurred.entrySet()) {
            if(e.getValue() == 1) {
                nrc = e.getKey();
                break;
            }
        }
        return nrc;
    }
}
