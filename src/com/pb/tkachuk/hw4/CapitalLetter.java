package com.pb.tkachuk.hw4;
import java.util.Scanner;

/* 1. Создайте класс CapitalLetter в пакете hw4. +
        Напишите программу, которая принимает строку и переводит первую букву слова в верхний регистр.
        Строку должен ввести пользователь.
*/


public class CapitalLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String first;
        System.out.println("Введите строку и мы обязательно сделаем вам первую букву заглавной: ");
        first = in.nextLine();
        System.out.println("Строка с заглавной буквой:  " + capitaliseFirstLetter(first));

    }

                public static String capitaliseFirstLetter(String str) {
                    String[] arr = str.split(" ");
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
                    }
                    return String.join(" ", arr);
                }

        }



