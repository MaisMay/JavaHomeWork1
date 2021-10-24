package com.pb.tkachuk.hw4;

import java.util.Arrays;
import java.util.Scanner;
/*
2. Создайте класс Anagram в пакете hw4.
        Напишите программу, которая определяет, является ли одна строка анаграммой другой строки.
        Обе строки вводит пользователь.
        Анаграмма - это слово или фраза, сделанная путем переноса букв другого слова или фразы.
        Программа должна игнорировать пробелы и знаки препинания.

 */

public class Anagram {
    public static void main(String[] args) {
        String str1, str2;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку№1: ");
        str1 = in.nextLine();

        System.out.println("Введите  строку№2: ");
        str2 = in.nextLine();

        isAnagram(str1, str2);
        System.out.println(isAnagram(str1,str2));
    }

    public static boolean isAnagram(String str1, String str2) {
        char[] word1 = str1.replaceAll("[\\s]", "").toCharArray();
        char[] word2 = str2.replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);

        boolean result = Arrays.equals(word1, word2);
        return result;

        }
    }

