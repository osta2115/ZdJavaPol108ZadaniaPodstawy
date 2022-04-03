package pl.sdacademy.java.basic.exercises.day2;

public class Task6 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        char searchedChar = 'm';
        System.out.println(getIndex(input, searchedChar));
    }

    private static int getIndex (String input, char searchedChar){
        if (StringHelper.isValid(input) && input.contains(String.valueOf(searchedChar))){
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == searchedChar){
                    return i;
                }
            }
        }
        return -1;
    }
}
