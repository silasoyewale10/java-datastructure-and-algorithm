package datastructures;

import java.util.Arrays;

public class RepeatedWord {

    public String repeatedWord(String sentence) {
        int count = 0;
        String[] words = sentence.toLowerCase().split(" ");
        String [] checkers = new String [words.length];
        String [] answer = new String [checkers.length];
        int k = 0;
        for (int i = 0; i < words.length && k < 1; i++) {
            for (int j = i + 1; j < words.length && k < 1; j++) {
                if (words[i].equals(words[j])) {
                    checkers[i] = words[i];
                    k = 10;
                }
            }
        }
        for(int i = 0; i < checkers.length; i++){
            if(checkers[i] != null){
                System.out.println("checkers[i] = " + checkers[i]);
                answer[i] = checkers[i];
            }
        }

//        System.out.println(answer[0]);

        if(answer[0] != null){
            return answer[0];
        }
        else{
            return "no duplicates";
        }

//        return answer[0];
    }
}
