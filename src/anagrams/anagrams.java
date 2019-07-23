package anagrams;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class anagrams {

    public static int numberNeeded(String one, String two) {

        // an integer array for counting letters (size 26)
        int[] lettercounts = new int[26];

        //  Loop through characters in first string, add c-'a' (26) to lettercounts for each character
        for(char c : one.toCharArray()){
            lettercounts[c-'a']++;
            System.out.println("String one, char: "+ c + Arrays.toString(lettercounts));
        }

        //  Loop through characters in first string, add c-'a' (26) to lettercounts for each character
        for(char c : two.toCharArray()){
            lettercounts[c-'a']--;
            System.out.println("String two, char: "+ c + Arrays.toString(lettercounts));
        }

        int result = 0;

        for(int i : lettercounts){
            result += Math.abs(i);
        }
        return result;
    }


    public static int numberNeededLamda(String one, String two){
        int [] letters =  new int[26];
        one.chars().forEach( c -> { letters[c-'a']++; });
        two.chars().forEach( c -> { letters[c-'a']--; });

        return IntStream.of(letters).map(i -> Math.abs(i)).sum();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println("Number of characters to delete to produce an anagram: "+ numberNeeded(a, b));

        System.out.println("Lamda result: " + numberNeededLamda(a, b));
    }
}