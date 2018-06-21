package com.company;

public class QuestionOne {

    public static void main(String[] args) {

        System.out.println(sortByString("weather", "therapyw"));

    }

    public static String sortByString(String s, String t){

        StringBuilder sortedStr = new StringBuilder();

        for (int i = 0; i < t.length(); i++) {

            for (int j = 0; j < s.length(); j++) {

                if(s.charAt(j) == t.charAt(i)){

                    sortedStr.append(s.charAt(j));
                }
            }
        }

        return sortedStr.toString();
    }
}
