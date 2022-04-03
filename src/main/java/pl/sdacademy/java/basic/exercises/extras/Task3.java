package pl.sdacademy.java.basic.exercises.extras;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] ints = {1,0,5,10,0,6};
        System.out.println(Arrays.toString(ints));

        System.out.println(Arrays.toString(moveZerosoEndOfArray(ints)));
    }

    private static int[] moveZerosoEndOfArray(int[] ints) {
        int[] zerosAtEnd = new int[ints.length];
        int counter = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != 0) {
                zerosAtEnd[counter] = ints[i];
                counter++;
            }
        }
        return zerosAtEnd;
    }
}
