package com.patrickshobby;

public class Main {

    public static void main(String[] args) {

        //word reversal
        String phraseToReverse = "Dog bites Man";
        String phraseReversedResult = reversePhrase(phraseToReverse);
        System.out.println("Problem 1 Phrase Reverse : " + phraseToReverse + " is reversed to " + phraseReversedResult);

        //find the word
        String stringContainingWord = "I love Java";
        String findWord = "java";







	// write your code here
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
