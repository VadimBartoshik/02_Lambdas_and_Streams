package com.epam.task2.task2_2_3_4;

public class Runner {
    public static void main(String[] args) {

        Operation operation;
        operation = (x,y)->x+y;

        int result = operation.calculate(10, 20);
        System.out.println(result);
        operation.print("");
        Operation.isNull("abc");
    }
}
