package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task2 {
    public static final float PI = 3.14f;

    public static void main(String[] args) {
        float radius = getDiameterFromUser() / 2;
        double circumference = calcualteCircumferenceOfADiameter(radius);
        double area = calculateAreaOfACircle(radius);

        System.out.println("Radius: " + radius);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }
    public static float getDiameterFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert diameter: ");
        return scanner.nextFloat();
    }

    public static double calcualteCircumferenceOfADiameter(float radius){
        // return 2 * PI * radius;
        return 2 * Math.PI * radius;
    }

    public static double calculateAreaOfACircle(float radius){
        // return PI * Math.pow(radius , 2);
        return  Math.PI * Math.pow(radius, 2);
    }
}
