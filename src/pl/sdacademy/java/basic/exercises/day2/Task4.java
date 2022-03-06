public class Task4 {
    private static final String REPLACEMENT = "-STOP-";
    private static final String REGEX = "[.,]";

    public static void main(String[] args) {
        String input = "Ala, ma kota. Kot, ma Ale.";
        System.out.println(replaceText(input));
    }

    private static String replaceText(String input) {
        if (StringHelper.isValid(input)){
           //return input = input.replace(".", REPLACEMENT).replace(",", REPLACEMENT);
            return input.replaceAll(REGEX, REPLACEMENT);
        }
        return input;
    }
}
