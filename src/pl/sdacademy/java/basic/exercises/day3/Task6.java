package pl.sdacademy.java.basic.exercises.day3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task6 {
    private static final String INPUT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert date of next classes in format [" + INPUT_DATE_FORMAT + "]: ");
        String input = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(INPUT_DATE_FORMAT);
        LocalDateTime nextClassesDate = LocalDateTime.parse(input, formatter);

        LocalDateTime currentDate = LocalDateTime.now();
        LocalTime localTime = LocalTime.now();

        long days = Duration.between(currentDate, nextClassesDate).toDays();
        long hours = Duration.between(localTime, nextClassesDate).toHours();
        System.out.println("You have " + days + " days to next classes");
        System.out.printf("You have %01d days %01d hours to next classes", days, hours);

    }
}
