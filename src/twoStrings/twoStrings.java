package twoStrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class twoStrings {

    public static String twoStrings(String s1, String s2) {

        Set set1 = new HashSet(Arrays.asList(s1.split("")));
        Set set2 = new HashSet(Arrays.asList(s2.split("")));

        Set set3 = new HashSet(set1);
        set3.addAll(set2);

        System.out.println("set 1: "+ set1.toString());
        System.out.println("set 2: " + set2.toString());
        System.out.println("set 3: " + set3.toString());

        return set3.size() == set1.size() + set2.size() ? "NO" : "YES";

    }

    public static void main (String[] args){

        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String s1 = scanner.next();
        System.out.println("Enter a second string");
        String s2 = scanner.next();

        String result = twoStrings(s1, s2);

        System.out.println("Result: "+ result);
    }
}
