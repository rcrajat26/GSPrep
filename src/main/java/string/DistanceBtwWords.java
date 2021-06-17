package string;

import javax.swing.text.html.parser.Entity;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Map.Entry;

public class DistanceBtwWords {

    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:\\Users\\Rajat_Chikkodikar\\Desktop\\My files\\Projects\\GSIncubation\\src\\main\\java\\string\\_scratch.txt");
        Scanner sc = new Scanner(input);

        String in = sc.nextLine();
        String word1 = sc.next();
        String word2 = sc.next();

//        DistanceBtwWords dbw = new DistanceBtwWords();
        System.out.println(distanceBetweenWords(in,word1,word2));

    }

    public static int distanceBetweenWords(String sentence, String word1,String word2) {

        Map<Integer,Integer> wordOccurrence = new TreeMap<>();

        int smallDist = Integer.MAX_VALUE,index=-1;
        while(index<sentence.length()) {
            index = sentence.indexOf(word1,index+1);
            if(index == -1) break;
            wordOccurrence.put(index,0);
        }

        index = -1;
        while(index<sentence.length()) {
            index = sentence.indexOf(word2,index+1);
            if(index == -1) break;
            wordOccurrence.put(index,1);
        }

        Iterator itr = wordOccurrence.entrySet().iterator();
        Entry<Integer,Integer> prev = (Entry<Integer, Integer>) itr.next();

        while (itr.hasNext()) {
            Entry<Integer,Integer> curr = (Entry<Integer, Integer>) itr.next();
            if(prev.getValue() != curr.getValue()) {
                int diff = Math.abs(prev.getKey()-curr.getKey());
                if(diff<smallDist)
                smallDist = diff;
            }
            prev=curr;
        }

        return smallDist;
    }
}
