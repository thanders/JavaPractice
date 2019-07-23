package alternatingCharacters;

import java.util.Scanner;

public class alternatingCharacters {

    static int alternatingCharacters(String s){

        int requireDeletions= 0;

        char prevChar= s.charAt(0);

        for(int i =0; i<s.length()-1; i++) {

            if (s.charAt(i)==s.charAt(i+1)){
                requireDeletions++;
            }
            System.out.println("I is: "+i +" Current Character is: "+ s.charAt(i)+ " Previous Character is: " + prevChar + " Delete: "+requireDeletions);

        }

        return requireDeletions;

    }

    public static void main(String[] args){

        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of strings you want to input:");
        // int q = scanner.nextInt();

        System.out.println("Enter a string:");
        String s = scanner.next();

        int result =alternatingCharacters(s);



        System.out.println(result);

    }
}
