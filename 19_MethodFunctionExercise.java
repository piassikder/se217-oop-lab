public class MethodFunctionExercise {
    static int square(int number) {
        return number * number;
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int number = 8;

        System.out.println("Square: " + square(number));
        System.out.println("Even: " + isEven(number));
    }
}
