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
        Set<String> sorted = new HashSet<>();

        List<String> l = new ArrayList<>();


        String[] words = inp.split("\\s+");
        for(String word:words)
        {
            String currWord = word;
            word = sort(word);
            if(!sorted.contains(word)) {
                Set<String> set = new HashSet<>();
                sorted.add(word);
                set.add(currWord);
                group.add(set);
            }
            else {
                Set<String> s;
                for(Set<String> set:group) {

                }
            }
        }
        return group;
    }

    private static String sort(String word) {
        char[] tmp = word.toCharArray();
        Arrays.sort(tmp);
        return new String(tmp);
    }
}
