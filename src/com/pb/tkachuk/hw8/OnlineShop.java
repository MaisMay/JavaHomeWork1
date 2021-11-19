package com.pb.tkachuk.hw8;

import java.util.Scanner;

public class OnlineShop {

    public static void main(String[] args) {
        // сканер для считывания  и назначения переменным логина и пароля
        Scanner scan = new Scanner(System.in);

        System.out.println("Задайте логин: длина должна быть от 5 до 20 символов только латинские буквы и цифры");
        String login = scan.nextLine();

        System.out.println("Задайте пароль: длинна должна быть более 5, только латинские буквы, цифры и знак подчеркивания");
        String password = scan.nextLine();

        System.out.println("Подтвердите пароль: ");
        String confirmPassword = scan.nextLine();

        // создаем обьект
        Auth auth = new Auth();
        try {
            // защищенный код
            auth.signUp(login, password, confirmPassword);
                        try {
                            System.out.println("Введите логин");
                            login = scan.nextLine();
                            System.out.println("Введите пароль");
                            password = scan.nextLine();

                            auth.signIn(login, password);

                        } catch (WrongLoginException e) {
                            e.printStackTrace();
                            System.out.println(e.getMessage());
                        }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Попробуйте еще ");
        }
    }
}
