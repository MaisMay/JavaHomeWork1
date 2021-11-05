package com.pb.tkachuk.hw6;
/*
Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
Метод sleep, например, может выводить на консоль "Такое-то животное спит".
 */
public abstract class Animal {
    // свойства класа родителя
    private String food;
    private String location;

    public Animal() {
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    // геттеры сеттеры

    public String getFood() {
        return food;
    }


    public String getLocation() {

        return location;
    }

    // методы животных
    public void sleep() {
        System.out.println("Животное спит.");
    }
    public void eat() {
        System.out.println("Животное ест");
    }

    public abstract String makeNoise();



}
