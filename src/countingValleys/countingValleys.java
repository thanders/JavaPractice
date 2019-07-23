package countingValleys;

public class countingValleys {

    static int countingValleys(int n, String s) {

        int sealevel = 0;

        int valleys = 0;


        System.out.println("test");


        for (int i = 0; i < n; i++) {

            char c = s.charAt(i);

            if (c == 'U') {
                sealevel += 1;

            }
            if (c == 'D') {
                sealevel -= 1;

            }


            if (sealevel == 0 && c== 'U') {
                valleys+=1;

            }
        }
        return valleys;

    }




    public static void main(String[] args){

        System.out.println("Hello");

        String s = "DDUUUUDDDDUU";

        int valleys = countingValleys(12, s);

        System.out.println("Number of valleys: " + valleys);


    }
}
