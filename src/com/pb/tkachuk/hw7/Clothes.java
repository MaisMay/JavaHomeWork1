package com.pb.tkachuk.hw7;
/*
Создать абстрактный класс Clothes (одежда) содержащий переменные размер (типа Size), стоимость, цвет.
 */
public class Clothes {
    Size size;
    int cost;
    String color;

    public Clothes(Size size, int cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
}
