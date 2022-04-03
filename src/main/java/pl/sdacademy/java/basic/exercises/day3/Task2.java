package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Pattern;

public class Task2 {

    public static final String IBAN_REGEX = "PL[0-9]{26}";

    public static void main(String[] args) {
        System.out.println(isIbanCorrect("PL10105000997603123456789123"));
        System.out.println(isIbanCorrect("PL1010500099760312345678912"));
        System.out.println(isIbanCorrect("PL101050009976031234567891235"));
        System.out.println(isIbanCorrect("pl10105000997603123456789123"));
        System.out.println(isIbanCorrect("GB10105000997603123456789123"));
        System.out.println(isIbanCorrect("PL1010500099760312345678-.23"));
    }

    public static boolean isIbanCorrect(String iban){
        /*
        true:
        PL10105000997603123456789123

        false:
        pl10105000997603123456789123
        PL101050009976031234567891232
        PL1010500099760312345678912
        10105000997603123456789123
         */
        Pattern pattern = Pattern.compile(IBAN_REGEX);
        return pattern.matcher(iban).matches();
    }
}
