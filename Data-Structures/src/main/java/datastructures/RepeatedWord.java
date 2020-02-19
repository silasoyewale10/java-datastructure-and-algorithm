package datastructures;

import java.util.Arrays;

public class RepeatedWord {

    public String repeatedWord(String sentence) {
        int count = 0;
        String[] words = sentence.toLowerCase().split(" ");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    return words[i];
                }
            }
        }
        return "no duplicates";
    }
}
