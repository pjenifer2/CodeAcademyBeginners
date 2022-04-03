package com.patrickshobby;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        //word reversal
        String phraseToReverse = "Dog bites Man";
        String phraseReversedResult = reversePhrase(phraseToReverse);
        System.out.println("Problem 1 Phrase Reverse : " + phraseToReverse + " is reversed to " + phraseReversedResult);

        //find the word
        String phrase = "I love Java";
        String findWord = "java";
        int count = wordCount(phrase, findWord);
        System.out.println("The number of times " + findWord + " appears in " + phrase + " is " + count);

        


    }

    private static int wordCount(String phrase, String findWord) {
        int wordCount = 0;

        String[] wordsFromPhrase = phrase.split(" ");
        for (int i = 0; i<wordsFromPhrase.length; i++) {
            String lowerCaseWord = wordsFromPhrase[i].toLowerCase();
            if (wordsFromPhrase[i].equals(lowerCaseWord)) {
                wordCount++;
            }
        }
        return wordCount;
    }

    private static String reversePhrase(String phraseToReverse){
        String[] words = phraseToReverse.split(" ");
        //for(String word:words) System.out.println(word);
        String[] reverseWordArray = new String[words.length];
        int j = 0;
        for (int i=words.length-1; i >= 0; i--){
            reverseWordArray[j] = words[i];
            j++;
        }
        String phraseReversed = String.join(" ", reverseWordArray);
        return phraseReversed;

    }
}
