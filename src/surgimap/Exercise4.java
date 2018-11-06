package surgimap;

//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.Assume.assumeTrue;


public class Exercise4 {

    /*
    Returns true if the input sentence (as a String) is palindrome, false otherwise
    A sentence or a word is palindrome if, once reverted, it equals the original word
    e.g. 'anna' is palindrome, 'Bob' is palidrome, 'mark' is not palindrome
    */
    public static boolean isPalindrome(String s) {
        //validate input
        if (s.equalsIgnoreCase(""))
            return true;

        //normalise input: to lowercase, remove spaces
        s = s.toLowerCase();
        s = s.replace(" ", "");

        //revert word
        String reverted = "";
        for (int i = s.length() - 1; i >= 0; i--)
            reverted = reverted + s.charAt(i);

        //check if the word is palindrom (it equals the reverted)
        return s.equalsIgnoreCase(reverted);


    }

    /*
    Test the palindrome sentence functionality with positive (palindrome) and negative (not palindrome) words and sentences.
    Covers also cases e.g. upper / lower cases content, empty string etc.
     */

    /*
    @Test
    public void testPalindromeWords() {
        String test = "";
        System.out.println("Is '" + test + "' a palindrome word? " + isPalindrome(test));
        assertThat(isPalindrome(test)).isTrue().withFailMessage("Error with palindrome sentence: " + test + " Expected true, actual false");

        test = "Anna";
        System.out.println("Is '" + test + "' a palindrome word? " + isPalindrome(test));
        assertThat(isPalindrome(test)).isTrue().withFailMessage("Error with palindrome sentence: " + test + " Expected true, actual false");

        test = "aNna";
        System.out.println("Is '" + test + "' a palindrome word? " + isPalindrome(test));
        assertThat(isPalindrome(test)).isTrue().withFailMessage("Error with palindrome sentence: " + test + " Expected true, actual false");

        test = "bob";
        System.out.println("Is '" + test + "' a palindrome word? " + isPalindrome(test));
        assertThat(isPalindrome(test)).isTrue().withFailMessage("Error with palindrome sentence: " + test + " Expected true, actual false");

        test = "charlie goes to hollywood";
        System.out.println("Is '" + test + "' a palindrome word? " + isPalindrome(test));
        assertThat(isPalindrome(test)).isFalse().withFailMessage("Error with palindrome sentence: " + test + " Expected false, actual true");

        test = "anna anna anna";
        System.out.println("Is '" + test + "' a palindrome word? " + isPalindrome(test));
        assertThat(isPalindrome(test)).isTrue().withFailMessage("Error with palindrome sentence: " + test + " Expected true, actual false");

        test = "mark";
        System.out.println("Is '" + test + "' a palindrome word? " + isPalindrome(test));
        assertThat(isPalindrome(test)).isFalse().withFailMessage("Error with palindrome sentence: " + test + " Expected false, actual true");

        test = "Race car";
        System.out.println("Is '" + test + "' a palindrome word? " + isPalindrome(test));
        assertThat(isPalindrome(test)).isTrue().withFailMessage("Error with palindrome sentence: " + test + " Expected true, actual false");

        test = "in girum imus nocte ecce et consumimur igni";
        System.out.println("Is '" + test + "' a palindrome word? " + isPalindrome(test));
        assertThat(isPalindrome(test)).isTrue().withFailMessage("Error with palindrome sentence: " + test + " Expected true, actual false");

        test = "SI SEDES NON IS, SI NON SEDES IS";
        System.out.println("Is '" + test + "' a palindrome word? " + isPalindrome(test));
        assertThat(isPalindrome(test)).isTrue().withFailMessage("Error with palindrome sentence: " + test + " Expected true, actual false");

    }
    */
}

