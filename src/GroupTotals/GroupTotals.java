package GroupTotals;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class GroupTotals {

    public static String GroupTotals(String[] strArr) {

        HashMap <String, Integer> hmap = new HashMap<String,Integer>();
        Scanner scanner=new Scanner(System.in);

        int numValues = strArr.length;
        System.out.println("Number of values: " + numValues);
        int i = 0;
        Random rand = new Random();

        System.out.println("How many values would you like to enter?");

        // Loop through String Array to exact key value pairs and put them into map
        while (i<= numValues-1) {

            System.out.println("strArray index: "+ i);

            String path = strArr[i];

            String segments[] = path.split(":");

            Integer value = Integer.parseInt(segments[segments.length - 1]);

            String key = String.valueOf(segments[segments.length -2 ]);

            if (i < numValues){
                i++;}
            else{
                break;
            }
            // if already exists total and put into map
            if (hmap.containsKey(key)){
                int total = value + hmap.get(key);
                hmap.put(key, total);
            }
            // else put new key value pair into map
            else{
                hmap.put(key, value);
            }

            System.out.println("Your input - key: "+key+ " value: "+ value);

        }

        // create instance of StringBuilder
        StringBuilder sb=new StringBuilder("");


        int count = 1;

        // Create a string in the format key:value , ...
        for (Map.Entry<String, Integer> entry : hmap.entrySet()) {
            System.out.println(entry.getKey() + " , " + entry.getValue());
            sb.append(entry.getKey() + ":"+ entry.getValue());

            if (count != hmap.size()){
                sb.append(",");
            }
            count++;
        }

        String str = sb.toString();

        System.out.println("New String: " + str);

        // return the string
        return str;


    }


        public static void main(String[] args) {

        String[] example = {"B:-1", "A:1", "B:3", "A:5"};
        GroupTotals(example);


    }
}
