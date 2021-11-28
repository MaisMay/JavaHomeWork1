package com.pb.tkachuk.hw10;


/*
Реализовать параметризованный класс NumBox, T - параметр типа.
 */
public class NumBox<T extends Number> { // Параметром должен быть любой класс-наследник Number
    private final T[] numbers; //массив из объектов класса T, инициализировать массив в конструкторе.

    public NumBox(int size) {
        numbers = (T[]) new Number[size]; // конструктор принимающий параметр - максимальную длину массива.
    }

    public void add(T num) {        // метод void add(T num) добавляющий число в массив.
        try {
            int i = findPlace();
            numbers[findPlace()] = num;
        } catch (Exception ex) { // В случае если массив полон - выбросить исключение
            System.out.println(ex);
        }
    }

    public int findPlace() throws Exception {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == null) {
                return i;
            }
        }

        throw new Exception("Массив полон");
    }

    public T get(int i) {  // T get(int index) возвращающий число по индексу.
        return numbers[i];
    }

    public int length() {  //  T get(int index) возвращающий число по индексу.
        int length = 0;
        for (T number : numbers) {
            if (number != null) {
                length++;
            }
        }

        return length;
    }

    public double sum() { //  double sum() - сумма всех элементов массива.
        double result = 0;
        for (T number : numbers) {
            if (number != null) {
                result += new Double(number.toString());
            }
        }

        return result;
    }

    public double average() {  // double average() - подсчет среднего арифметического среди элементов массива.
        double average = sum() / length(); // сумма на длину

        return average;
    }

    public T max(){
        T result = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i].doubleValue() > result.doubleValue()) {
                result = numbers[i];
            }
        }
        return result;
    }

}