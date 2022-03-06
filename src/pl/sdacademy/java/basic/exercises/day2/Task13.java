package pl.sdacademy.java.basic.exercises.day2;

import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {
        /*int[] intsArray = new int [3];
        intsArray [0] = 5;
        intsArray [1] = 12;
        intsArray [2] = 7;*/
        int[] intsArray = {12, 7, 19};
        System.out.println(Arrays.toString(intsArray));
        System.out.println("Min value: " + getMinValue(intsArray));
        System.out.println("Max value: " + getMaxValue(intsArray));
        System.out.println("Total sum: " + getTotalSum(intsArray));
    }

    private static int getMinValue(int[] intsArray){
        int minValue = intsArray[0];
        for(int element : intsArray){
            if(element < minValue){
                minValue = element;
            }
        }
        return minValue;
    }

    private static int getMaxValue(int[] intsArray){
        int maxValue = intsArray[0];
        for(int element : intsArray){
            if(element > maxValue){
                maxValue = element;
            }
        }
        return maxValue;
    }

    private static int getTotalSum(int[] intsArray){
        int totalSum = 0;
        for(int element : intsArray){
            totalSum += element;
        }
        return totalSum;
    }
}
