package Lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class BasicClass {
    public static void main(String[] args) {
        if (getNumbers(10, 5)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (returnDigit(8)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        getNumbers(10, 5);
        getDigit(5);
        returnDigit(8);
        printWord("buzz", 3);
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        getArguments(5, 20);
    }

    //Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
    // от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean getNumbers(int f, int g) {
        int sum = f + g;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    // Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    //положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void getDigit(int z) {
        if (z < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }

    //Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    // если число отрицательное, и вернуть false если положительное.
    public static boolean returnDigit(int w) {
        if (w < 0) {
            return true;
        } else {
            return false;
        }
    }

    //Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
    // указанную строку, указанное количество раз;
    public static void printWord(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    //Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            {
                System.out.print(arr[i] + ";");
            }
        }
        System.out.println();
    }

    //Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + ";");
        } System.out.println();
    }

    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println();
    }

    //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
    // заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    // Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
    // то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void fillDiagonal() {
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int
    // длиной len, каждая ячейка которого равна initialValue
    public static void getArguments(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + "; ");
        }
    }
}
