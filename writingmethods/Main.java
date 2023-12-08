import java.util.Random;

public class MyProgram {

    public static void greet(String name) {
        System.out.println("Greetings, " + name);
    }

    public static String combineNames(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    public static String removeWhiteSpace(String input) {
        return input.trim();
    }

    public static void countCharacters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        System.out.println("The string has " + count + " characters.");
    }

    public static void outputLastFirst(String firstName, String lastName) {
        System.out.println(lastName + ", " + firstName);
    }

    public static void outputMessageFiveTimes(String message) {
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
    }

    public static void outputMessageNTimes(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }

    public static void outputLongerString(String str1, String str2) {
        if (str1.length() > str2.length()) {
            System.out.println(str1 + " is longer.");
        } else if (str2.length() > str1.length()) {
            System.out.println(str2 + " is longer.");
        } else {
            System.out.println("Both strings are of equal length.");
        }
    }

    public static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static int countSpaces(String sentence) {
        int spaceCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        return spaceCount;
    }

    public static int countCharacterOccurrences(String sentence, char character) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }

    public static String removeCharacter(String sentence, char character) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != character) {
                result.append(sentence.charAt(i));
            }
        }
        return result.toString();
    }

    public static String convertCase(String str, boolean toUpperCase) {
        if (toUpperCase) {
            return str.toUpperCase();
        } else {
            return str.toLowerCase();
        }
    }

    public static String getSubstringInRange(String str, int startIndex, int endIndex) {
        StringBuilder result = new StringBuilder();
        for (int i = startIndex; i < endIndex; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static char getRandomLetter() {
        Random random = new Random();
        char randomLetter = (char) (random.nextInt(26) + 'a');
        return randomLetter;
    }

    public static void main(String[] args) {
        greet("John");
        System.out.println(combineNames("John", "Doe"));
        System.out.println(removeWhiteSpace("  Hello, there  "));
        countCharacters("Test string");
        outputLastFirst("John", "Doe");
        outputMessageFiveTimes("Hello!");
        outputMessageNTimes("Goodbye!", 3);
        outputLongerString("Hello", "Hi");
        System.out.println(isPalindrome("racecar"));
        System.out.println(countSpaces("This is a test sentence"));
        System.out.println(countCharacterOccurrences("Hello, world!", 'o'));
        System.out.println(removeCharacter("Hello, world!", 'o'));
        System.out.println(convertCase("Hello", true));
        System.out.println(getSubstringInRange("Hello, world!", 3, 7));
        System.out.println(getRandomLetter());
    }
}
import java.util.Random;

public class MyProgram {

    public static void greet(String name) {
        System.out.println("Greetings, " + name);
    }

    public static String combineNames(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    public static String removeWhiteSpace(String input) {
        return input.trim();
    }

    public static void countCharacters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        System.out.println("The string has " + count + " characters.");
    }

    public static void outputLastFirst(String firstName, String lastName) {
        System.out.println(lastName + ", " + firstName);
    }

    public static void outputMessageFiveTimes(String message) {
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
    }

    public static void outputMessageNTimes(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }

    public static void outputLongerString(String str1, String str2) {
        if (str1.length() > str2.length()) {
            System.out.println(str1 + " is longer.");
        } else if (str2.length() > str1.length()) {
            System.out.println(str2 + " is longer.");
        } else {
            System.out.println("Both strings are of equal length.");
        }
    }

    public static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static int countSpaces(String sentence) {
        int spaceCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        return spaceCount;
    }

    public static int countCharacterOccurrences(String sentence, char character) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }

    public static String removeCharacter(String sentence, char character) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != character) {
                result.append(sentence.charAt(i));
            }
        }
        return result.toString();
    }

    public static String convertCase(String str, boolean toUpperCase) {
        if (toUpperCase) {
            return str.toUpperCase();
        } else {
            return str.toLowerCase();
        }
    }

    public static String getSubstringInRange(String str, int startIndex, int endIndex) {
        StringBuilder result = new StringBuilder();
        for (int i = startIndex; i < endIndex; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static char getRandomLetter() {
        Random random = new Random();
        char randomLetter = (char) (random.nextInt(26) + 'a');
        return randomLetter;
    }

    public static void main(String[] args) {
        greet("John");
        System.out.println(combineNames("John", "Doe"));
        System.out.println(removeWhiteSpace("  Hello, there  "));
        countCharacters("Test string");
        outputLastFirst("John", "Doe");
        outputMessageFiveTimes("Hello!");
        outputMessageNTimes("Goodbye!", 3);
        outputLongerString("Hello", "Hi");
        System.out.println(isPalindrome("racecar"));
        System.out.println(countSpaces("This is a test sentence"));
        System.out.println(countCharacterOccurrences("Hello, world!", 'o'));
        System.out.println(removeCharacter("Hello, world!", 'o'));
        System.out.println(convertCase("Hello", true));
        System.out.println(getSubstringInRange("Hello, world!", 3, 7));
        System.out.println(getRandomLetter());
    }
}
