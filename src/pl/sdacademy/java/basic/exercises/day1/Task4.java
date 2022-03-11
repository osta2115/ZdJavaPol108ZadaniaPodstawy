package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task4 {
    private static final float BMI_MIN_RANGE = 18.5F;
    private static final float BMI_MAX_RANGE = 24.9F;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert weight in kg: ");
        float weight = scanner.nextFloat();

        System.out.print("Please insert height in cm: ");
        int height = scanner.nextInt();

        double bmi = calculateBmi(weight, height);
        displayBmiResult(bmi);
    }

    public static double calculateBmi(float weight, int height){
        float heightInMeter = convertCmToMeter(height);
        return weight / Math.pow(heightInMeter, 2);
    }

    private static void displayBmiResult(double bmi) {
        if(bmi < BMI_MIN_RANGE || bmi > BMI_MAX_RANGE) {
            System.out.println("BMI is incorrect: " + bmi);
        } else {
            System.out.println("BMI is correct: " + bmi);
        }
    }

    private static float convertCmToMeter(int height) {
        return height / 100F;
    }
}
