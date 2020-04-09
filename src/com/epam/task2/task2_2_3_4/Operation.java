package com.epam.task2.task2_2_3_4;

@FunctionalInterface
public interface Operation {
    int calculate(int x, int y);
    default void print(String str) {
        if (!isNull(str))
            System.out.println("Класс MyData. Печатаем строку: " + str);
    }

    static boolean isNull(String str) {
        System.out.println("Статический метод проверки на null");

        return str == null ? true : "".equals(str) ? true : false;
    }
}
