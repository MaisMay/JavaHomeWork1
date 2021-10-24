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

        static String capitaliseFirstLetter(String name){
            return name.substring(0, 1).toUpperCase() + name.substring(1);  // возвращает новую строку
                                                                           // которая является подстрокой данной строки.
                                                                          // Подстрока начинается с символа, заданного индексом,
                                                                         // и продолжается до второго аргумента .

        }
    }


