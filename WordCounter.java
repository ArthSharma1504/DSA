import java.util.Arrays;

public class WordCounter {

    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0; // Handle null or empty input
        }

        // 1. Using String.split() (most common and usually best)
        // Split the string by any whitespace character (space, tab, newline, etc.)
        String[] words = str.split("\\s+"); // \\s+ is a regular expression for one or more whitespace characters.
        return words.length;


        // 2. Manual counting (more complex, but can be useful in specific cases)
        /*
        int wordCount = 0;
        boolean inWord = false; // Flag to track if we're currently inside a word

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isWhitespace(c)) { // Check if the character is whitespace
                if (inWord) {
                    wordCount++;
                    inWord = false;
                }
            } else {
                inWord = true; // We're inside a word
            }
        }

        // Handle the case where the last word doesn't have trailing whitespace
        if (inWord) {
            wordCount++;
        }

        return wordCount;
        */

    }

    public static void main(String[] args) {
        String testString1 = "This is a test string.";
        String testString2 = "  Leading and trailing spaces.  ";
        String testString3 = ""; // Empty string
        String testString4 = null; // Null string
        String testString5 = "One\nTwo\tThree"; // Newlines and tabs

        System.out.println("\"" + testString1 + "\" has " + countWords(testString1) + " words.");
        System.out.println("\"" + testString2 + "\" has " + countWords(testString2) + " words.");
        System.out.println("\"" + testString3 + "\" has " + countWords(testString3) + " words.");
        System.out.println("Null string has " + countWords(testString4) + " words.");
        System.out.println("\"" + testString5 + "\" has " + countWords(testString5) + " words.");


    }
}