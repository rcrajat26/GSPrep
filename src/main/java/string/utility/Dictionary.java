package string.utility;

import java.util.Arrays;

public class Dictionary {

    public Dictionary() {
    }

    String[] words;
    public Dictionary(String[] words) {
        this.words = words;
        Arrays.sort(words);
    }

    public String[] getWords() {
        return words;
    }

    public void setWords(String[] words) {
        this.words = words;
        Arrays.sort(words);
    }
}
