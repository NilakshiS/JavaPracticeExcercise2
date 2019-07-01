package com.stackroute.pe2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String inputNumber;
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter the string to be checked");
        inputNumber = inputObject.nextLine();
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.checkForPalindrome(inputNumber));

    }
    public String stringReverse(String string){
        String output = "";
        for (int i = string.length()-1 ; i >= 0; i--) {
            output += string.charAt(i);
        }
        return output;
    }
    public String checkForPalindrome(String string){
        String output = "";
        if (string.equals("")){
            output = "Error: Please enter a valid string!";
            return output;
        }
        boolean flag = true;
        for (int i = string.length()-1;i>=string.length()/2;i--){
            if (string.charAt((string.length()-1)-i)!=string.charAt(i)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            output += "The string is a palindrome";
        }
        else {
            output += "The string is not a palindrome";
        }
        return output;
    }
}
