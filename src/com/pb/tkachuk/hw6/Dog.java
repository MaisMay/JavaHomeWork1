package com.pb.tkachuk.hw6;

/*
Dog, Cat, Horse переопределяют методы makeNoise, eat.
Добавьте переменные (поля) в классы Dog, Cat, Horse, характеризующие только этих животных.
 */
public class Dog extends  Animal {
    private String barkiness;



    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public void eat() {
        System.out.println("Ест с аппетитом");
    }

    @Override
    public String makeNoise() {
        return "Гав";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        if (!super.equals(o)) return false;

        Dog dog = (Dog) o;

        return barkiness != null ? barkiness.equals(dog.barkiness) : dog.barkiness == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (barkiness != null ? barkiness.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return " Собака " +
                " Ест:'" + getFood() + '\'' +
                " Живет в :'" + getLocation() + '\'';
    }
}