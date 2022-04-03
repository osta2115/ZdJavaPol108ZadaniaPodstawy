package pl.sdacademy.java.basic.exercises.day2;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        int[] intsArray = {12, -7, 19, -5};
        System.out.println("Input: " + Arrays.toString(intsArray));
        int lengthOfTheNewArray = countNegativeValuesInArray(intsArray);
        System.out.println("Ile ujemnych: " + lengthOfTheNewArray);
        if (lengthOfTheNewArray > 0){
            int[] arrayWithOnlyNegativeValues = createArrayWithOnlyNegativeValues(intsArray, lengthOfTheNewArray);
            System.out.println("Result: " + Arrays.toString(arrayWithOnlyNegativeValues));
        }

    }

    private static int countNegativeValuesInArray(int[] intsArray){
        int counter = 0;
        for (int element : intsArray) {
            if(element < 0){
                counter++;
            }
        }
        return counter;
    }
    private static int[] createArrayWithOnlyNegativeValues(int[] intsArray, int lengthOfNewArray ){
        int[] negativeArray = new int[lengthOfNewArray];
        int i = 0;
        for (int element : intsArray){
            if (element < 0){
                negativeArray[i] = element;
                i++;
            }
        }
        return negativeArray;
    }
}
