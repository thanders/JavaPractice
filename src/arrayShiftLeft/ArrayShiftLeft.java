package arrayShiftLeft;

import java.util.Arrays;
import java.util.Scanner;

// RepeatedString class
public class ArrayShiftLeft {

    // RepeatedString method
    static int[] ArrayShiftLeft(int[] array, int shiftBy){

        // declare a temporary array of size shiftBy
        int [] temp = new int[shiftBy];

        System.out.println("length of temp array: " + temp.length + " " + Arrays.toString(temp));

        // loop through inputted array for the indexes to shift by
        for (int i = 0; i<=shiftBy-1; i++){
            // add those elements to the temp array
            temp[i] = array[i];
            System.out.println("temp added: " + i + " shift by " + shiftBy);
        }

        System.out.println("temp done: " + Arrays.toString(temp));

        // declare a new array of size
        int [] shifted = new int[array.length];

        int startShifted = array.length-shiftBy;

        System.out.println("start shifted: " + startShifted);

        for (int i = 0; i<shifted.length; i++){
            if (i <= startShifted){
                System.out.println("right");
                shifted[i] = array[i-shiftBy];

            }
            else{
                System.out.println("shifted numbers, i= " + i);
                shifted[i] =temp[i];
                System.out.println("Adding element to index "+ i +" array: "+ Arrays.toString(shifted));
            }

        }
        System.out.println("shifting done - new array: "+ Arrays.toString(shifted));
        System.out.println("temp array: "+ Arrays.toString(temp));
        return shifted;

    }


    // main method
    public static void main(String[] args){

        // Input the array elements

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();

        System.out.println("Enter the "+ size + " elements (one by one)");
        int array [] = new int[size];
        //Read in:
        for (int i = 0; i < size; i++){
            array[i] = in.nextInt();
            System.out.println("index: "+ i + " is " + array[i]);
            }

        System.out.println("How many elements would you like to shift by? ");
        int shiftBy = in.nextInt();

        // Call the ArrayShiftLeft method
        int [] newArray = ArrayShiftLeft(array, shiftBy);


        System.out.println("The shifted array is : "+ newArray);
        }


}
