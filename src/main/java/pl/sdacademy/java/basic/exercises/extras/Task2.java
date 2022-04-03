package pl.sdacademy.java.basic.exercises.extras;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First char:");
        char firstChar = scanner.next().charAt(0);
        System.out.println("Second char:");
        char secondChar = scanner.next().charAt(0);
        System.out.println("Distance: " + getDistanceBetweenChars(firstChar,secondChar));

    }

    public static int getDistanceBetweenChars(char a, char b) {
        return Math.abs(Character.toLowerCase(b) - Character.toLowerCase(a));

    }
}
