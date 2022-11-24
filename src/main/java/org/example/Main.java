package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(palindromeChecker(null));
        System.out.println(palindromeChecker(""));
        System.out.println(palindromeChecker("Hannah"));
        System.out.println(palindromeCheckRecursion("Hannah"));
        System.out.println(palindromeChecker("Race c ar  "));
        System.out.println(palindromeCheckRecursion("Race c ar  "));
        System.out.println(palindromeChecker("race %&¬(&,..* %c  ar! !"));
        System.out.println(palindromeCheckRecursion("race ,..%&¬(&* %c  ar! !"));
    }

    public static boolean palindromeChecker(String word) {
        boolean isPalindrome = false;
        if (word == null) {
            return false;
        } else if (word.length() == 1) {
            return true;
        }
        String wordRevised = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = 0; i < wordRevised.length() / 2; i++) {
            if (wordRevised.charAt(i) == wordRevised.charAt(wordRevised.length() - i - 1)) {
                isPalindrome = true;
            } else isPalindrome = false;
        }
        return isPalindrome;
    }

    public static boolean palindromeCheckRecursion(String word) {
        if (word == null) {
            return false;
        } else if (word.length() <= 1) {
            return true;
        }
        String cleanWord = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return palindromeCheckRecursion(cleanWord.substring(1, cleanWord.length() - 1));
    }
}
