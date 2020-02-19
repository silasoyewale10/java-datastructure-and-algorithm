package datastructures;

import java.util.Arrays;

public class RepeatedWord {

    public String repeatedWord(String sentence) {
        int count = 0;
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {

            for (int j = i + 1; j < words.length; j++) {
//                System.out.println(words[i]);

                if (words[i] == words[j]) {
                    System.out.println(words[i]);
                    return words[i];
                }
//                return;
            }
        }
        return "no duplicates";
    }

}
