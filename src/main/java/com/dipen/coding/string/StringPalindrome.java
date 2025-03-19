package com.dipen.coding.string;

public class StringPalindrome {
    public static boolean checkPalindrome(String string) {
        // Convert the string to lower case to ensure case-insensitive comparison
        string = string.toLowerCase();

        // Remove characters except numbers and alphabets
        String cleanedText = string.replaceAll("[^a-z0-9]", "");

        int start = 0;
        int end = cleanedText.length() - 1;

        // Compare characters from both ends towards the center
        while (start < end) {
            if (cleanedText.charAt(start) != cleanedText.charAt(end)) {
                return false;  // Mismatch found, not a palindrome
            }
            start++;
            end--;
        }
        return true;  // All characters matched, it's a palindrome
    }

    public static void main(String[] args) {
        String text = "1 abc i cba 1?";
        boolean isPalindrome = checkPalindrome(text);

        if (isPalindrome) {
            System.out.println("The given text is a palindrome");
        } else {
            System.out.println("The given text is not a palindrome");
        }
        //System.out.println(isPalindrome ? "The given text is a palindrome" : "The given text is not a palindrome");

    }
}
