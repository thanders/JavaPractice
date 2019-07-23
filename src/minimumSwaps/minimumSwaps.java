package minimumSwaps;

import java.util.Arrays;

public class minimumSwaps {

    public static int minimumSwaps(int[] arr) {


        int minSwaps= 0;
        int currentMin= arr[0];

        for(int currentIndex=0; currentIndex < arr.length-1; currentIndex++){

            System.out.println("Current index = "+ currentIndex + " Min swaps= " + minSwaps);
            System.out.println("Current Index: " + currentIndex + " Current Min " + currentMin + " Array: " +Arrays.toString(arr));

            if (arr[currentIndex] <= arr[currentIndex+1]){

                    currentMin= arr[currentIndex];
                    System.out.println("Smaller");

                }

            else{
                System.out.println("larger");
                int swap= arr[currentIndex];
                arr[currentIndex] =arr[currentIndex+1];
                arr[currentIndex+1] =swap;
                minSwaps++;
            }

            System.out.println("Current Index: " + currentIndex + " Current Min: " + currentMin + " Array: " + Arrays.toString(arr));
        }

        System.out.println("Current Min: "+ currentMin);



        return minSwaps;
    }

    public static void main(String[] args){


        System.out.println("Welcome to Minimum Swaps");

        int arr[]= {1,3,5,2,4,6,7};//declaration, instantiation and initialization

        System.out.println("Array to sort: " + Arrays.toString(arr));

        int minSwaps = minimumSwaps(arr);

        System.out.println("Minimum required swaps to sort: " + minSwaps);


    }
}
