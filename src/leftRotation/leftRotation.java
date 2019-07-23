package leftRotation;

import java.util.Arrays;
import java.util.Scanner;

// RepeatedString class
public class leftRotation {

    // RepeatedString method
    static int[] LeftRotation(int[] array, int shiftBy) {

        System.out.println("Inputted array : "+ Arrays.toString(array));

        int[] temp = new int[shiftBy];

        for (int i = 0; i<array.length; i++){

            // if i is less than shiftBy, add array[i] to temporary array
            if (i < shiftBy){
                temp[i]=array[i];
            }

        }
        System.out.println("Temp array : "+ Arrays.toString(temp));

        // shift left
        for (int j=0;j<array.length-shiftBy; j++){
            array[j]= array[j+shiftBy];
        }

        System.out.println("left shift : "+ Arrays.toString(array));

        // append temporary array
        for (int k= 0; k<temp.length; k++){

            array[array.length-shiftBy+k] = temp[k];
        }

        return array;

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
        int [] newArray = LeftRotation(array, shiftBy);

        System.out.println("The resulting shifted array is : "+ Arrays.toString(newArray));

    }
}
