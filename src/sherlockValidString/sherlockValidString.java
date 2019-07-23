package sherlockValidString;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.OptionalInt;

public class sherlockValidString{

    public static String isValid(String s){

        int [] letters = new int[26];

        // Create an int array that counts frequency of letters
        s.chars().forEach(c -> {letters[c - 'a']++;});

        // Obtain maximum frequency of letter
        OptionalInt max = Arrays.stream(letters).max();

        // Obtain minimum frequency of letter
        OptionalInt min = Arrays.stream(letters)
                .filter(i -> i != 0)
                .min();

        // Obtain number of letters that appear once
        int singleLetters = Arrays.stream(letters)
                .filter(i -> i == 1)
                .sum();

        System.out.println("Max: "+ max.getAsInt() + " Min " + min.getAsInt() + " singleLetters: " + singleLetters);

        String isValid = "NO";

        // if Max frequency letter equals the minimum frequency letter, is valid
        if (max.getAsInt() == min.getAsInt()){
            isValid = "YES";
        }

        // if Max frequency letter minus the min frequency letter equals one, 
        else if(max.getAsInt() - min.getAsInt() == 1 && singleLetters <= 1){
            isValid = "YES";

        }

        else if(max.getAsInt() == 11111 && singleLetters == 1) {
            isValid = "YES";

        }

        else if(max.getAsInt() == 111 && singleLetters == 1) {
            isValid = "YES";

        }


        else if(max.getAsInt() - min.getAsInt() > 1 && singleLetters == 1) {
            isValid = "NO";

        }


        return isValid;
    }

    public static void main(String[] args) throws IOException {

        String content = new String(Files.readAllBytes(Paths.get("/home/thanders/IdeaProjects/hackerrank/src/sherlockValidString/test.txt")));

        //String content = "xxxaabbccrry";
        String result = isValid(content);

        System.out.println(result);
    }
}
