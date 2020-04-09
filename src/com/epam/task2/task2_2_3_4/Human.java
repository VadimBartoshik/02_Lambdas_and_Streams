package com.epam.task2.task2_2_3_4;

public class Human {

    public boolean isNull(String str) {
        System.out.println("checking for null");

        return str == null ? true : false;
    }


    static SayHello human= new SayHello() {
        @Override
        public void sayHello() {
            System.out.println("Hello");
        }
    };
}
