package com.pb.tkachuk.hw6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
В пакете hw6 создайте класс Animal и расширяющие его классы Dog, Cat, Horse.
Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
Метод sleep, например, может выводить на консоль "Такое-то животное спит".
Dog, Cat, Horse переопределяют методы makeNoise, eat.
Добавьте переменные (поля) в классы Dog, Cat, Horse, характеризующие только этих животных.
В классах Dog, Cat, Horse переопределить методы toString, equals, hashCode.
Создайте класс Veterinarian (Ветеринар), в котором определите метод void treatAnimal(Animal animal).
Пусть этот метод печатает на экран food и location пришедшего на прием животного.
Создайте класс VetСlinic в его методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
В цикле отправляйте животных на прием к ветеринару.
Объект класса Veterinarian создайте с помощью рефлексии.
 */
public class VetСlinic {

    public static void main(String[] args) throws ClassNotFoundException,
            NoSuchMethodException, InvocationTargetException, InstantiationException,
            IllegalAccessException {
        //Рефлексия
        Class сlazz = Class.forName("com.pb.tkachuk.hw6.Veterinarian");
        Veterinarian veterinarian = null;
        Constructor constr = сlazz.getConstructor(new Class[]{});
        Object obj = constr.newInstance();
        if (obj instanceof Veterinarian) veterinarian = (Veterinarian) obj;
        // создаем животных  по конструктору
        Dog dog1 = new Dog("сухой корм", "в доме" );
        Dog dog2 = new Dog("с мусорки", "во дворах");

        Cat cat1 = new Cat("с мусорки", "во дворах");
        Cat cat2 = new Cat("рыбу", "в доме");


        Horse horse1 = new Horse("морковь", "в селе");
        Horse horse2 = new Horse("траву", "в селе");

        // массив типа Animal, в который запишите животных всех имеющихся у вас типов.
        Animal[] animals = new Animal[]{dog1, dog2, cat1, cat2, horse1, horse2};
        //
        System.out.println("______________________");
        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
           // пробую метод из анимал
            if (animal instanceof Dog) ((Dog) animal).eat(); // наследует метод ит от родителя анимал
            if (animal instanceof Dog) ((Dog) animal).sleep(); // наследует метод слип от родителя анимал

        }

        }
    }
