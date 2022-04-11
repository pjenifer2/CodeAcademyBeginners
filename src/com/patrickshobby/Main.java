/*
    https://www.codecademy.com/resources/blog/java-code-challenges-for-beginners/
 */

package com.patrickshobby;

import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        //1. word reversal
        String phraseToReverse = "Dog bites Man";
        String phraseReversedResult = reversePhrase(phraseToReverse);
        System.out.println("Problem 1 Phrase Reverse : " + phraseToReverse + " is reversed to " + phraseReversedResult);

        //2. find the word
        String phrase = "I love Java";
        String findWord = "java";
        int count = wordCount(phrase, findWord);
        System.out.println("The number of times " + findWord + " appears in " + phrase + " is " + count);

        //3. anagrams
        String wordOne = "listen";
        String wordTwo = "silent";
        System.out.println(isAnagram(wordOne, wordTwo));


        //9 & 10. return prime factors
        int number = 17;
        int[] primeNumbers = new int[number];
        int index = 0;
        for(int i = 2; i < number; i++){
            if (isPrime(i)){
                primeNumbers[index] = i;
                index++;
            }
        }

       for (int i = 0; i < primeNumbers.length; i++){
           if (primeNumbers[i] != 0 && (primeNumbers[i+1]) != 0){
               System.out.print(primeNumbers[i] + ", ");
           }
           if (primeNumbers[i] != 0 && primeNumbers[i+1] == 0){
               System.out.print(primeNumbers[i]);
           }
       }
    }

    private static boolean isAnagram(String wordOne, String wordTwo){
        boolean result = false;

        if (wordOne.length() == wordTwo.length()){
            char[] wordOneChars = new char[wordOne.length()];
            for (int i = 0; i < wordOne.length(); i++) wordOneChars[i] = wordOne.charAt(i);
            Arrays.sort(wordOneChars);

            char[] wordTwoChars = new char[wordTwo.length()];
            for (int i = 0; i < wordTwo.length(); i++) wordTwoChars[i] = wordTwo.charAt(i);
            Arrays.sort(wordTwoChars);

            result = Arrays.equals(wordOneChars, wordTwoChars);


        } else {
            result = false;
        }

        return result;
    }

    private static boolean isPrime(int num){
        int primeCount = 0;
        for (int i = num; i > 0; i--){
            if(num % i == 0) primeCount++;
        }
        if (primeCount > 2) {
            return false;
        } else {
            return true;
        }
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
