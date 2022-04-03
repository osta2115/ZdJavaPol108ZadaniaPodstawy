package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit;
        int totalNumber = 0;
        int totalNumberEven = 0;
        int totalSum = 0;
        do {
            System.out.print("Please insert digit: ");
            digit = scanner.nextInt();
            totalNumber++;
            if (digit % 2 == 0){
                totalNumberEven++;
            }
            totalSum += digit;
        }while (digit != 0);

        System.out.println("Total Number Of Digits: " + --totalNumber); // odejmujemy ponieważ chcemy wyleliminować 0, które kończy prace programu
        System.out.println("Total Number Of Even Digits: " + --totalNumberEven); // odejmujemy ponieważ chcemy wyleliminować 0, które kończy prace programu
        float arithmeticAverage = (float) totalSum / totalNumber;
        System.out.println("Arithmetic Average: " + arithmeticAverage);
    }
}
