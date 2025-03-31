package com.dipen.coding.wrapperclass;

public class CharacterWrapper {
    public static void main(String[] args) {
        //1. boolean isLetter(char ch) returns true if character is upper case of lower case
        System.out.println(Character.isLetter('a'));
        //2. boolean isDigit(char ch) returns true if the character is a digit(0-9)
        System.out.println(Character.isDigit('1'));
        //3. boolean isWhitespace(char ch) returns true if character is whitespace character (space, tab, new line)
        System.out.println(Character.isWhitespace(' '));
        //4. boolean isUpperCase(Character ch) returns true if the character is upper case
        System.out.println(Character.isUpperCase('c'));
        //5. boolean isLowerCase(Character ch) returns true if the character is lower case
        System.out.println(Character.isLowerCase('A'));
        //6. char toLowerCase(char ch) returns lowercase equivalent of the character
        System.out.println(Character.toLowerCase('B'));
        //7. char toUpperCase(char ch) returns uppercase equivalent of the character
        System.out.println(Character.toUpperCase('z'));
        //8. boolean isAlphabetic(char ch) returns true if character is an alphabetic character(letters)
        System.out.println(Character.isAlphabetic('i'));
        //9. int getNumericValue(char ch) returns the numeric value of the character
        System.out.println(Character.getNumericValue('5'));
        System.out.println(Character.getNumericValue('C'));
        //10. boolean isLetterOrDigit(char ch) returns true if the character is either a letter or a digit
        System.out.println(Character.isLetterOrDigit('a'));
        //11. String toString(char ch) converts given character to string
        System.out.println(Character.toString('y'));

        System.out.println(Boolean.parseBoolean("true"));
    }
}
