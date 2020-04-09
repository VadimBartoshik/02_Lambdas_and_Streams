package com.epam;

import com.epam.task1.Person;
import com.epam.task1.PersonList;
import com.epam.task2.Calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        try {
          //  System.out.println(Calculator.SquareRoot(-3.0, x -> x > 0));
            Calculator.printerNumber(Calculator.multiplication(3.0,1.0));
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }
}
