package com.company;

public class QuestionThree {

    public static void main(String[] args){

        int[] array = new int[]{1,2,3};
        System.out.println(changePossibilities(4, array));

    }

    private static int changePossibilities(int amt, int[] denominations) {
        int[] denominationArray = new int[amt + 1];

        denominationArray[0] = 1;

        for (int i : denominations) {

            for (int j = i; j <= amt; j++) {

                int remainder = j - i;

                denominationArray[j] += denominationArray[remainder];

            }

        }

        return denominationArray[amt];
    }
}
