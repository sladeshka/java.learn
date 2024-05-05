package lab5;

public class lab5 {
    public static void main(String[] args) {
        // first task
        String fishText = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        String longestWord = findLongestWord(fishText);
        System.out.println(longestWord);
        // second task
        String palindrome = "Madam in Eden, I'm Adam";
        System.out.println(checkIsPalindrome(palindrome));
        String notPalindrome = "Abracadabra";
        System.out.println(checkIsPalindrome(notPalindrome));
        // third task
        String textWithObsceneWord = "There is an obscene word in the text";
        System.out.println(replaceWithCensored(textWithObsceneWord, "obscene word", "[censored]"));
        // fourth task
        System.out.println(findNumberOfOccurrences(fishText, "typesetting"));
        // fifth task
        System.out.println(invertWords(palindrome));
    }
    public static String findLongestWord(String string) {
        String[] words = string.split("\\s+");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
    public static boolean checkIsPalindrome(String string) {
        String cleanedString = string.replaceAll("[^a-zA-Z]", "");
        String invertedString = new StringBuilder(cleanedString).reverse().toString();
        return cleanedString.equalsIgnoreCase(invertedString);
    }
    public static String replaceWithCensored(String string, String obsceneWord, String replacementWord) {
        return string.replaceAll(obsceneWord, replacementWord);
    }
    public static int findNumberOfOccurrences(String string, String substring) {
        int lastIndex = 0;
        int count = 0;
        while (lastIndex != -1) {
            lastIndex = string.indexOf(substring, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += substring.length();
            }
        }
        return count;
    }
    public static String invertWords(String string) {
        String[] words = string.split(" ");
        StringBuilder invertedString= new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            invertedString.append(words[i]).append(" ");
        }
        return invertedString.toString();
    }
}
