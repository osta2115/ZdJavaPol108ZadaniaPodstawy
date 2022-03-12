package pl.sdacademy.java.basic.exercises.day3.task8;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Mickiewicz", "PL");
        Author author2 = new Author("Sienkiewicz", "PL");
        Author author3 = new Author("Rowling", "GB");

        Poem[] poems = new Poem[3];
        poems [0] = new Poem(author1, 420);
        poems [1] = new Poem(author2, 550);
        poems [2] = new Poem(author3, 360);

        String surname = getSurnameWithMaxStropheNumbers(poems);
        System.out.println(surname);

        Author author = getSurnameWithMaxStropheNumbers_2(poems);
        System.out.println(author);

    }

    private static String getSurnameWithMaxStropheNumbers(Poem[] poems){
        int max = 0;
        String surname = null;
        for (Poem poem : poems) {
            int currentStropheNumbers = poem.getStropheNumbers();
            if (max < currentStropheNumbers){
                max = currentStropheNumbers;
                surname = poem.getCreator().getSurname();
            }
        }
        return surname;
    }

    private static Author getSurnameWithMaxStropheNumbers_2(Poem[] poems){
        int max = 0;
        Author author = null;
        for (Poem poem : poems) {
            int currentStropheNumbers = poem.getStropheNumbers();
            if (max < currentStropheNumbers){
                max = currentStropheNumbers;
                author = poem.getCreator();
            }
        }
        return author;
    }

}
