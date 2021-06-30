package misc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:\\Users\\Rajat_Chikkodikar\\Desktop\\My files\\Projects\\GSIncubation\\src\\main\\java\\misc\\_scratch");
        Scanner sc = new Scanner(input);

        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(pascal(m,n));
    }

    private static int pascal(int m, int n) {
        HashMap<String,Integer> mem = new HashMap<>();
        return pascal(m,n,mem);
    }

    private static int pascal(int m, int n, HashMap<String,Integer> mem) {
        if(n==0) return 1;
        if(m==n) return 1;

        if(m-n<m/2.0) {
            n=m-n;
        }

        String key = m+","+n;
        if(mem.containsKey(key)) return mem.get(key);
        mem.put(key,pascal(m-1,n,mem)+pascal(m-1,n-1,mem));

        return mem.get(key);
    }
}
