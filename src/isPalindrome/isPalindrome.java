package isPalindrome;

public class isPalindrome {

    String word;
    String wordLowercase;

    public isPalindrome(String str) {

        this.word = str;
        this.wordLowercase = str.toLowerCase();
        System.out.println("Word: " + this.word);
        System.out.println("Characters in String: " + this.word.length() + " Half characters: " + this.word.length() / 2);

    }

    // Check if palindrome (case sensitive)
    private boolean check() {

        for (int i = 0; i <= this.word.length() / 2; i++) {

            char right = this.word.charAt(this.word.length() - i - 1);
            char left = this.word.charAt(i);

            if (left != right) {
                System.out.println("Not a valid palindrome: left " + left + " right " + right);
                return false;
            }
        }
        return true;

    }

    // Check if palindrome (case sensitive)
    private boolean checkCaseSensitive() {

        for (int i = 0; i <= this.wordLowercase.length() / 2; i++) {

            char right = this.wordLowercase.charAt(this.wordLowercase.length() - i - 1);
            char left = this.wordLowercase.charAt(i);

            if (left != right) {
                System.out.println("Not a valid palindrome: left " + left + " right " + right);
                return false;
            }
        }

        return true;

    }


    public static void main (String[] args){

        String s = "racecar";
       isPalindrome ispal = new isPalindrome(s);

       System.out.println("Palindrome case-sensitive result: " + ispal.check());
        System.out.println("Palindrome case-insensitive result: " + ispal.checkCaseSensitive());


    }
}
