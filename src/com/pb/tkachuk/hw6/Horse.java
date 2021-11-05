package com.pb.tkachuk.hw6;

import java.util.Objects;

public class Horse extends Animal{
    private double weight;

    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    public void eat() {
        System.out.println("Ест лошади");
    }

    @Override
    public String makeNoise() {
        return "Фырк";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Horse)) return false;
        if (!super.equals(o)) return false;

        Horse horse = (Horse) o;

        return Double.compare(horse.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return " Лошадь" +
                " Ест: '" + getFood() + '\'' +
                " Живет: '" + getLocation() + '\'' ;
    }

}
