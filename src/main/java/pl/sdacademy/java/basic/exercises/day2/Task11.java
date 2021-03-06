package pl.sdacademy.java.basic.exercises.day2;

public class Task11 {
    public static void main(String[] args) {
        String text = "kajak";
        System.out.println("Result: " + isPalindrom(text));
        text = "sedes";
        System.out.println("Result: " + isPalindrom(text));
        text = "sda";
        System.out.println("Result: " + isPalindrom(text));
        text = "essa";
        System.out.println("Result: " + isPalindrom(text));
        System.out.println();

        text = "kajak";
        System.out.println("Result: " + isPalindromeWithStringBuilder(text));
        text = "sedes";
        System.out.println("Result: " + isPalindromeWithStringBuilder(text));
        text = "sda";
        System.out.println("Result: " + isPalindromeWithStringBuilder(text));
        text = "essa";
        System.out.println("Result: " + isPalindromeWithStringBuilder(text));

    }
    public static boolean isPalindromeWithStringBuilder(String input){
        StringBuilder inputAfterReverse = new StringBuilder(input).reverse();
        return input.equals(inputAfterReverse.toString());
    }

    public static boolean isPalindrom(String input){
        if (StringHelper.isValid(input)){
            int forward = 0;
            int backward = input.length() - 1;
            while (backward > forward){
                char forwardChar = input.charAt(forward);
                char backwardChar = input.charAt(backward);
                if (forwardChar != backwardChar){
                    return false;
                }
                forward++;
                backward--;
            }
            return true;
        }
        return false;
    }
}
