public class WordCounter {
    public static int countWords(String str) {
        return (str == null || str.trim().isEmpty()) ? 0 : str.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        System.out.println(countWords("This is a test string.")); // 5
        System.out.println(countWords("  Leading and trailing spaces.  ")); // 4
        System.out.println(countWords("")); // 0
        System.out.println(countWords(null)); // 0
        System.out.println(countWords("One\nTwo\tThree")); // 3
    }
}
