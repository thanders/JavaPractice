package colorCheck;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class colorCheck {


    static int sockMerchant(int n, int[] ar) {

            Set<Integer> colors = new HashSet<>();

            int pairs = 0;

            for (int i = 0; i < ar.length; i++) {
                // if colors does not contain ar[i] add it to the set of colors
                if (!colors.contains(ar[i])) {
                    colors.add(ar[i]);
                }
                // increase the number of pairs and remove that color from the set
                else {
                    pairs++;
                    colors.remove(ar[i]);
                }
            }

            return pairs;
        }

public static void main(String[] args){

    System.out.println("Hello");

    int[] ar = new int[] {1,2,2,1,4,1,1};

    sockMerchant(8, ar);


}

}


