package jumpingClouds;

// RepeatedString class
public class JumpingClouds {

    // RepeatedString method
    static int JumpingClouds(int[] clouds) {


        int jump =0;

        for (int i=0;i<clouds.length-2;i++)
        {
            if ( clouds[i+1]==0 && clouds[i+2]==0 && i<clouds.length-1  )
            {
                jump++;
                i++;
                continue;
            }
            else if (clouds[i+1]==0 && clouds[i+2]==1  && i<clouds.length-1)
            {
                jump++;

            }
            else if (clouds[i+1]==1 && clouds[i+2]==0  && i<clouds.length-1 )
            {
                jump++;
                i++;
                continue;
            }


        }
        if (clouds[clouds.length-1]==0 && clouds[clouds.length-2]==0)
        {
            jump++;

        }

        System.out.println(jump);

        return jump;

    }

    // main method
    public static void main(String[] args){

        // number of characters to consider
        int[] c = {0, 0, 0, 1, 0, 0};

        // Call the method
        int moves = JumpingClouds(c);

        System.out.println("Number of moves: "+ moves);

    }
}
