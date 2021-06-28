package misc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueTuples {

    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:\\Users\\Rajat_Chikkodikar\\Desktop\\My files\\Projects\\GSIncubation\\src\\main\\java\\misc\\_scratch");
        Scanner sc = new Scanner(input);

        String inp = sc.nextLine();
        int len = sc.nextInt();

        System.out.println(uniq(inp,len));

    }

    private static HashSet<String> uniq(String inp, int len) {

        HashSet<String> tuples = new LinkedHashSet<>();

        for(int i=0;i<inp.length()-len+1;i++) {
            tuples.add(inp.substring(i,i+len));
        }
        return tuples;
    }
}
