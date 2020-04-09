package com.epam.task3;

public class Runner {
    public static void main(String[] args) {
        ThreeFunction function;
        function = (x, y, z) -> x + y + z;
        int result= function.calculate(10,20,30);
        System.out.println(result);
        function = (x, y, z) -> x * y * z;
         result= function.calculate(10,20,30);
        System.out.println(result);
    }
}
