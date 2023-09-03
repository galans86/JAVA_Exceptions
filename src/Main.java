import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
//        Task1
        float numb = getNumber();
        System.out.println(numb);

//        Task2
//        try {
//            int d = 0;
//            int[] intArray = {0,1,2,3,4,5,6,7,8};
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e.getMessage());
//        }


//        Task3
//        try {
//            int a = 90;
//            int b = 3;
//            System.out.println(a / b);
//            printSum(23, 234);
//            int[] abc = { 1, 2 };
//            abc[3] = 9;
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        } catch (Throwable ex) {
//            System.out.println("Что-то пошло не так...");
//        }

//        Task 4
//        try {
//            String line = getLine();
//            System.out.println(line);
//        } catch (MyException e) {
//            System.out.println(e.getMessage());
//        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    public static float getNumber() {
        float numb;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input float number ");
            try {
                numb = scanner.nextFloat();
                return numb;
            } catch (InputMismatchException e) {
            }
        }
    }

    static class MyException extends IOException {
        MyException(String message, Exception e) {
            super(message, e);

        }
    }

    public static String getLine() throws MyException {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Value: ");
            String line = scanner.nextLine();
            if (line.isEmpty())
                throw new IOException("Empty value. Try again. IOException");
            else
                return line;
        } catch (IOException e) {
            throw new MyException("Empty value. Try again. MyException", e);
        }
    }
}

