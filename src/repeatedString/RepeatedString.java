package repeatedString;

// RepeatedString class
public class RepeatedString {

    // RepeatedString method
    static long RepeatedString(String s, long n) {

        // The inputted number
        final long num = n;

        // The remaineder of num / s.length()
        final long remainder=n%s.length();

        long count=0;

        for(char c : s.toCharArray())
            if(c == 'a')
                count++;

        // The factor of num / s.length  - how many s.length's divides evenly into num
        long factor = (num/s.length());

        //
        count =  factor*count  ;

        // Checks to see if remainder contains a's
        for(int i=0;i<remainder;i++)
            // if yes, increment count by 1  for each a
            if(s.charAt(i)=='a')
                count++;

        System.out.println("factor = " + factor + " remainder =" + remainder);
        System.out.println("Count: " + count);
        return count;



    }

    // main method
    public static void main(String[] args){

        // string
        String s = "a";

        // number of characters to consider
        long n = 1000000000;


        // Call the method
        RepeatedString(s, n);

    }
}
