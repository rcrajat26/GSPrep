package string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Pangram {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:\\Users\\Rajat_Chikkodikar\\Desktop\\My files\\Projects\\GSIncubation\\src\\main\\java\\string\\_scratch.txt");
        Scanner sc = new Scanner(input);

        String line = sc.nextLine();
        System.out.println(missingLetters(line));
    }

    private static String missingLetters(String line) {

        StringBuilder sb = new StringBuilder();
        Character[] letters = new Character[] {'a','b','c','d','e','f','g','h','i','j','k','l','m',
            'n','o','p','q','r','s','t','u','v','w','x','y','z'};
        List<Character> s =  Arrays.asList(letters);
        Set<Character> set = new HashSet<>(s);
        for(int i=0;i<line.length();i++) {
            Character curr = Character.toLowerCase(line.charAt(i));
            set.remove(curr);
        }

        for(char c:set) {
            sb.append(c);
        }
        return sb.toString();
    }
}
