package pl.sdacademy.java.basic.exercises.day2;

import java.util.Arrays;

public class Task15 {
    public static void main(String[] args) {
        String[] firstArray = {"Ala", "ma", "kota"};
        String[] secondArray = {"Ala", "ma", "kota"};

        System.out.println("Input: ");
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        System.out.println("Result: " + areEquals(firstArray, secondArray));
        System.out.println();

        String[] firstArray1 = {"Ala", "ma", "kota"};
        String[] secondArray1 = {"Ala", "ma", "kotaa"};

        System.out.println("Input: ");
        System.out.println(Arrays.toString(firstArray1));
        System.out.println(Arrays.toString(secondArray1));
        System.out.println("Result: " + areEquals(firstArray1, secondArray1));
        System.out.println();

        String[] firstArray2 = {"Ala", null, "kota"};
        String[] secondArray2 = {"Ala", "ma", "kota"};

        System.out.println("Input: ");
        System.out.println(Arrays.toString(firstArray2));
        System.out.println(Arrays.toString(secondArray2));
        System.out.println("Result: " + areEquals(firstArray2, secondArray2));
        System.out.println();

        String[] firstArray3 = {"Ala", "ma", "kota"};
        String[] secondArray3 = {"Ala", null, "kota"};

        System.out.println("Input: ");
        System.out.println(Arrays.toString(firstArray3));
        System.out.println(Arrays.toString(secondArray3));
        System.out.println("Result: " + areEquals(firstArray3, secondArray3));
        System.out.println();

        String[] firstArray4 = {"Ala", null, "kota"};
        String[] secondArray4 = {"Ala", null, "kota"};

        System.out.println("Input: ");
        System.out.println(Arrays.toString(firstArray4));
        System.out.println(Arrays.toString(secondArray4));
        System.out.println("Result: " + areEquals(firstArray4, secondArray4));

    }

    private static boolean areEquals(String[] firstArray,
                                     String[] secondArray){
        if (firstArray.length == secondArray.length){
            for (int i = 0; i < firstArray.length; i++) {
                String firstArrayElement = firstArray[i];
                String secondArrayElement = secondArray[i];
                if (firstArrayElement == null && secondArrayElement == null){
                    continue;
                }
                if (firstArrayElement == null || (!firstArrayElement.equals(secondArrayElement))){
                    return false;
                }
            }
        }
        return true;
    }
}
