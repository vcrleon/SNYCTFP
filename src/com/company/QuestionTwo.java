package com.company;


import java.util.Stack;

public class QuestionTwo {

    public static void main(String[] args) {

        System.out.println(decodeString("4[ab]"));
        System.out.println(decodeString("2[b3[a]]"));

    }

    public static String decodeString(String s) {

        StringBuilder decodedStr = new StringBuilder();
        Stack<StringBuilder> decodedStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();

        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[') {
                decodedStack.push(decodedStr);
                countStack.push(counter);
                decodedStr = new StringBuilder();
                counter = 0;
            } else if (c == ']') {
                StringBuilder tempStr = decodedStr;
                decodedStr = decodedStack.pop();
                counter = countStack.pop();
                while (counter > 0) {
                    decodedStr.append(tempStr);
                    counter -= 1;
                }
            } else if (c >= '0' && c <= '9') {
                counter *= 10;
                counter += c - '0';
            } else {
                decodedStr.append(c);
            }
        }

        return decodedStr.toString();
    }

}
