package string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:\\Users\\Rajat_Chikkodikar\\Desktop\\My files\\Projects\\GSIncubation\\src\\main\\java\\string\\_scratch.txt");
        Scanner sc = new Scanner(input);

        String inp = sc.nextLine();

        System.out.println(grpAnagrams(inp));
    }

    private static Set<Set<String>> grpAnagrams(String inp) {

        Set<Set<String>> group = new HashSet<>();
        Map<String,Set<String>> sorted = new HashMap<>();

        String[] words = inp.split("\\s+");
        for(String word:words)
        {
            String currWord = word;
            word = sort(word);
            if(!sorted.containsKey(word)) {
                Set<String> set = new HashSet<>();
                set.add(currWord);
                sorted.put(word,set);
            }
            else {
                Set<String> s = sorted.get(word);
                s.add(currWord);
            }
        }

        sorted.values().forEach(v->group.add(v));
        return group;
    }

    private static String sort(String word) {
        char[] tmp = word.toCharArray();
        Arrays.sort(tmp);
        return new String(tmp);
    }
}
