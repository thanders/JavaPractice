package codingGameTest;


/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
class codingGameTWO {

    static boolean exists(int[] ints, int k) {

        for(int i= 0; i<ints.length; i++){
            if (ints[i] == k){
                return true;
            }
        }
        return false;

    }


    public static void main (String[] args){

        int arr[]= {-9, 14, 37, 102};
        int k = 102;
        boolean result = exists(arr,k);
        System.out.println("result: "+ result);
    }


}