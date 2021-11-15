package com.pb.tkachuk.hw7;
/*
Создать класс Atelier с методом main, и еще двумя статическими методами:
dressMan(Clothes[] clothes)
dressWomen(Clothes[] clothes)
на вход которых будет поступать массив, содержащий все типы одежды.
В методе main создать массив, содержащий все типы одежды, и вызвать методы dressMan и dressWomen передав туда этот массив.
Метод dressWomen выводит на консоль всю информацию о женской одежде.
Метод dressMan выводит на консоль всю информацию о мужской одежде.
В методах dressWomen и dressMan использовать оператор instanceof для определения мужская это одежда или женская.
 */

public class Atelier {
    public static void main(String[] args) {
//создать массив, содержащий все типы одежды, и вызвать методы dressMan и dressWomen передав туда этот массив.
        Clothes [] clothes = new Clothes[4];
        clothes[0] = new Tshirt(Size.S, 55, "Черный");
        clothes[1] = new Pants(Size.XXS, 75, "Голубой");
        clothes[2] = new Skirt(Size.M, 65, "Черный");
        clothes[3] = new Tie(Size.L, 86, "Красный");

        dressMan(clothes);
        dressWomen(clothes);

    }
// В методах dressWomen и dressMan использовать оператор instanceof для определения мужская это одежда или женск
    public static void dressMan(Clothes[] clothes) {
        System.out.println("Одежда для мужчин: ");
        for (Clothes c : clothes) {
            if (c instanceof ManClothes) {
                ((ManClothes) c).dressMan();
            }
        }
    }

    public static void dressWomen(Clothes[] clothes) {
        System.out.println("Одежда для женщин: ");
        for (Clothes c : clothes) {
            if (c instanceof WomenClothes) {
                ((WomenClothes) c).dressWomen();
            }
        }
    }
}