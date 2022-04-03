package pl.sdacademy.java.basic.exercises.day1;

import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        tooMuchTooManyGame();
    }

    private static void tooMuchTooManyGame(){
        int randomValue = new Random().nextInt(101);
        boolean isEqual = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Insert number: ");
            int chosenNumber = scanner.nextInt();
            if (randomValue == chosenNumber){
                isEqual = true;
                System.out.println("Bingo!");
            } else if (chosenNumber < randomValue){
                System.out.println("Not enough");
            } else {
                System.out.println("Too much");
            }
        } while (!isEqual);
    }
}
