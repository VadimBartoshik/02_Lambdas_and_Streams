package com.epam.task2.task2_1;

import java.util.function.*;

public class Calculator {

    public static Double SquareRoot(Double number) throws ArithmeticException {
        Predicate<Double> isPositive = x -> x > 0;
        if (isPositive.test(number)) {
            return Math.sqrt(number);
        } else {
            throw new ArithmeticException("cannot find the square root of a negative number");
        }
    }

    public static Double addition(Double firstNumber, Double secondNumber) {
        BinaryOperator<Double> add = (x, y) -> x + y;
        return add.apply(firstNumber, secondNumber);
    }

    public static Double multiplication(Double firstNumber, Double secondNumber) {
        BinaryOperator<Double> multiply = (x, y) -> x * y;
        return multiply.apply(firstNumber, secondNumber);
    }

    public static Double subtraction(Double firstNumber, Double secondNumber) {
        BinaryOperator<Double> subtract = (x, y) -> x - y;
        return subtract.apply(firstNumber, secondNumber);
    }

    public static Double division(Double firstNumber, Double secondNumber) {
        BinaryOperator<Double> divide = (x, y) -> x / y;
        return divide.apply(firstNumber, secondNumber);
    }

    public static Double square(Double number) {
        UnaryOperator<Double> square = x -> x * x;
        return square.apply(number);
    }

    public static String convertToString(Double number) {
        Function<Double, String> convert = x -> String.valueOf(x);
        return convert.apply(number);
    }

    public static void printerNumber(Double number) {
        Consumer<Double> printer = x -> System.out.println(x);
        printer.accept(number); // 600 долларов
    }


}
