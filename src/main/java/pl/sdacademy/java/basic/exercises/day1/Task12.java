package pl.sdacademy.java.basic.exercises.day1;

public class Task12 {
    public static void main(String[] args) {
        System.out.println(ownModuloImplementation(10,35));
        System.out.println(ownModuloImplementation(10,3));
        System.out.println(ownModuloImplementation(4,2));
        System.out.println(ownModuloImplementation(4,3));

        System.out.println(ifOwnModuloImplementationIsCorrect(2, 4));
        System.out.println(ifOwnModuloImplementationIsCorrect(4, 2));
        System.out.println(ifOwnModuloImplementationIsCorrect(3, 4));
        System.out.println(ifOwnModuloImplementationIsCorrect(4, 3));
    }

    private static int ownModuloImplementation(int a, int b){
        return a - a / b * b;
    }
    private static boolean ifOwnModuloImplementationIsCorrect(int a, int b) {
        return ownModuloImplementation(a, b) == (a % b);
    }
}
