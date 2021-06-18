package string;

import string.utility.Dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestWord {

    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:\\Users\\Rajat_Chikkodikar\\Desktop\\My files\\Projects\\GSIncubation\\src\\main\\java\\string\\_scratch.txt");
        Scanner sc = new Scanner(input);

        String inp = sc.next();
        Dictionary dict = new Dictionary(new String[]{"to","ote", "toe", "toes", "doe", "dog", "god", "dogs", "book", "banana"});
        Set<String> res = longestWord(inp,dict);

        for(String s: res) System.out.println(s);
        //System.out.println(inp.contains("oe"));
    }

    static Set<String> longestWord(String letters, Dictionary dictionary) {

        Set<String> wordList = new HashSet<>();
        String longestWord="";

        for(String word:dictionary.getWords()) {
            String currWord = word;
            word=sort(word);
            letters=sort(letters);

            if(letters.contains(word) && longestWord.length()<=word.length()) {
                wordList.add(currWord);
                longestWord = currWord;
            }
        }
        int longLen = longestWord.length();
        wordList.removeIf(s -> {return s.length()<longLen;});
        return wordList;
    }

    private static String sort(String unsorted) {
        char[] chars = unsorted.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
