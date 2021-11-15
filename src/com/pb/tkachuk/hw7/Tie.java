package com.pb.tkachuk.hw7;
//  Tie (галстук) реализует интерфейс ManClothes.

public class Tie extends Clothes implements ManClothes {

    public Tie(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одел галстук\nразмер: "
                + size.getDescription() + "(" + size.getEuroSize() + ")\n"
                + "стоимость: " + cost + "$\n"
                + "цвет: " + color
        );
    }
}
