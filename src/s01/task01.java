package s01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int[] arr = new int[]{1, 2};
        System.out.println(arr[2]);
    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int result = 1/0;
    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        int result = Integer.parseInt("string");

    }
}

public class task01 {

    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
