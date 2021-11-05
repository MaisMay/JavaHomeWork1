package com.pb.tkachuk.hw6;


public class Cat  extends Animal {

    private String name;


    public Cat(String food, String location) {
        super(food, location);
    }


    @Override
    public void eat() {
        System.out.println("Ест кошка: ");
    }

    @Override
    public String makeNoise() {
        return "Кошка meaw: ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        if (!super.equals(o)) return false;

        Cat cat = (Cat) o;

        return name != null ? name.equals(cat.name) : cat.name == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return " Кот " +
                "Ест:'" + getFood() + '\'' +
                "Живет в:'" + getLocation() + '\'';
    }
}