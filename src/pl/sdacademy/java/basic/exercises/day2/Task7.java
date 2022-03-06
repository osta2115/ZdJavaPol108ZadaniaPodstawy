package pl.sdacademy.java.basic.exercises.day2;

public class Task7 {
    private static final char SPACE_SIGN = ' ';
    public static void main(String[] args) {
        String text = "Ala ma kota";
        System.out.println(getPercent(text));
    }

    private static double getPercent(String input){
        double percent = 0;
        if (StringHelper.isValid(input) && input.contains(String.valueOf(SPACE_SIGN))){
            //if (input != null && input.contains(String.valueOf(SPACE_SIGN))){ //gdy same spacje musza dac wynik
                double counter = 0;
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == SPACE_SIGN){
                        counter++;
                    }
                }
                percent = (counter / input.length()) * 100;
            }
        return percent;
    }
}
