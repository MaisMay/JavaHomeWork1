package com.pb.tkachuk.hw10;


/*
При подсчете воспользоваться тем,
что у любого из объектов подклассов Number есть методы intValue, doubleValue, floatValue и другие.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("intValue: ");
        System.out.println("____________________");
        NumBox<Integer> intArr = new NumBox<>(2);
        intArr.add(0); // 0
        intArr.add(1); // 1

        System.out.println("Среднее значение: " + intArr.average());
        System.out.println("Максимальное значение: " + intArr.max());
        System.out.println("Размер массива: " + intArr.length());
        System.out.println("Сумма элементов: " + intArr.sum());

        System.out.println("____________________");
        System.out.println("____________________");
        System.out.println("____________________");

        // floatValue
        System.out.println("floatValue: ");
        System.out.println("____________________");
        NumBox<Float> floatArr = new NumBox<>(3);
        floatArr.add(1.35f);
        floatArr.add(2.8f);
        floatArr.add(5.1f);
        System.out.println("Среднее значение: " + floatArr.average());
        System.out.println("Максимальное значение: " + floatArr.max());
        System.out.println("Размер массива: " + floatArr.length());
        System.out.println("Сумма элементов: " + floatArr.sum());

    }
}