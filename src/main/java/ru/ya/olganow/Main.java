package ru.ya.olganow;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        int intValue = 5;
        double doubleValue = 3.14;

        int sum = a + b;
        System.out.println("Сумма: " + sum);

        int difference = b - a;
        System.out.println("Разность чисел b и а : " + difference);

        int product = a * b;
        System.out.println("Произведение чисел a и b: " + product);

        double division = (double) b / a;
        System.out.println("Деление чисел a и b: " + division);

        int remainder = b % a;
        System.out.println("Остаток от деления чисел b % a;: " + remainder);

        boolean isEqual = (a == b);
        boolean isGreater = (a > b);
        System.out.println("a равно b? " + isEqual);
        System.out.println("a больше b? " + isGreater);

        int maxInt = Integer.MAX_VALUE;
        System.out.println("Максимальное значение int: " + maxInt);
        int overflow = maxInt + 1;
        System.out.println("Переполнение int: " + overflow);

        double resultAdd = intValue + doubleValue;
        System.out.println("Сложение int и double: " + resultAdd);

        double resultMul = intValue * doubleValue;
        System.out.println("Умножение int и double: " + resultMul);

        float floatValue = 7.5f;
        double mixedResult = doubleValue / floatValue;
        System.out.println("Деление double на float: " + mixedResult);
    }
}
