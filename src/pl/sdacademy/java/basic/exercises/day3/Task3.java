package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Pattern;

public class Task3 {
    // [0-9] -> \d
    // [a-zA-Z] -> \w
    public static final String NUMBER_REGEX = "-?[0-9]+(,[0-9]+)?";

    public static void main(String[] args) {
        System.out.println(isNumberCorrect("1234,1234"));
        System.out.println(isNumberCorrect("1234"));
        System.out.println(isNumberCorrect("-1234"));
        System.out.println(isNumberCorrect("1"));
        System.out.println();
        System.out.println(isNumberCorrect("1234,"));
        System.out.println(isNumberCorrect(",1234"));
        System.out.println(isNumberCorrect("1234a1234"));
        System.out.println(isNumberCorrect("a"));
        System.out.println(isNumberCorrect(""));
        System.out.println(isNumberCorrect("123 123"));
        System.out.println(isNumberCorrect("1234,-1234"));
        System.out.println(isNumberCorrect("123,213,321"));

    }

    public static boolean isNumberCorrect(String number){
        /*
        true:
        "1234,1234"
        "1234"
        "-1234"

        false:
        "1234a1234"
        ",1234"
        "1234,"
        ","
         */

        Pattern pattern = Pattern.compile(NUMBER_REGEX);
        return pattern.matcher(number).matches();
    }
}
