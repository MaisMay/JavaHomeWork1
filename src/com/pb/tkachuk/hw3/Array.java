package com.pb.tkachuk.hw3;
import java.util.Arrays;
import java.util.Scanner;
/*
2. Создайте класс Array в пакете hw3.Программа должна позволить
пользователю ввести одномерный массив целых чисел размерностью 10 элементов.
Вывести на экран введенный массив.
Подсчитать сумму всех элементов массива и вывести ее на экран.
Подсчитать и вывести на экран количество положительных элементов.
Произвести сортировку этого массива от меньшего к большему по алгоритму сортировки пузырьком.
 (https://en.wikipedia.org/wiki/Bubble_sort)
Вывести на экран отсортированный массив.
 */
public class Array {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] numbers = new int[10];
    System.out.println("Введите значения массива: ");
    for (int a = 0; a < numbers.length; a++) {
      numbers[a] = scan.nextInt();
    }
    System.out.printf("Вы ввели массив: %s", Arrays.toString(numbers));
    // блок поиска положительных елементов
    int suma = 0;
    for (int b = 0; b <numbers.length; b++) {
      if (numbers[b] > 0)
        suma += numbers[b];
    }
    System.out.printf("\nСумма положительных элементов массива: %s", suma);

    // блок сортировки пузырьком
    boolean sorted = false;
    int x;
    while (!sorted) {
      sorted = true;
      for (int n = 0; n < numbers.length - 1; n++) {
        if (numbers[n] > numbers[n + 1]) {
          x = numbers[n];
          numbers[n] = numbers[n+1];
          numbers[n+1] = x;
          sorted = false;
        }
      }
    }
    System.out.printf("\nОтсортированный пузыкрьковый массив: %s", Arrays.toString(numbers));
  }
}