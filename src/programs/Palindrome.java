package programs;

import java.util.Objects;

public class Palindrome {

    public static void main(String[] args) {
        String myText = "noon";
        String case2 = "ciVic";
        String case3 = "madaM";
        String case4 = "rewqD";
        checkPalindrome(myText);
        checkPalindrome(case2);
        checkPalindrome(case3);
        checkPalindrome(case4);
        checkPalindrome("");

    }

    public static void checkPalindrome(String inputText) {

        if (inputText.strip().equals("")) {
            System.out.println("Please provide a string");
            return;
        }

        String text = inputText.toLowerCase();

        StringBuilder reversedString = new StringBuilder();

        for (int i=text.length() - 1; i >= 0; i--) {
            reversedString.append(text.charAt(i));
        }

        if (Objects.equals(text, reversedString.toString())) {
            System.out.printf("The given string %s is a palindrome%n", inputText);
        } else {
            System.out.printf("The given string %s is not a palindrome\n", inputText);
        }

    }

}

