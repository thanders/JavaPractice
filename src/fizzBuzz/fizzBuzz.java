package fizzBuzz;

public class fizzBuzz {

    public static void fizzBuzz(int max){
        for (int i=0; i<=max; i++){

            if (i % 3 == 0){
                System.out.println("Fizz: "+ i);
            }

            if (i % 5 == 0){
                System.out.println("Buzz: " + i);
            }
            else{
                System.out.println("Number: "+i);
            }

        }
    }

    public static void main (String[] args){
        fizzBuzz(100);
    }
}
