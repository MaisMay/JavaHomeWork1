package com.pb.tkachuk.hw5;

import java.util.Arrays;

/*
Класс Library используется как демонстрация работы классов Book и Reader.
Имеет метод main() в котором создается массивы объектов Book и Reader, по 3 или более элементов в каждом.
Выполняются такие действия:
- печатаются все книги.
- печатаются все читатели.
- демонстрируется работа всех вариантов методов takeBook() и returnBook().
 */
import java.util.Arrays;

public class Library {
    public static void main(String[] args) {
        // блок создания  конструкторов 
        Book book1 = new Book("Пинокио", "неизвестный автор", 1911);
        Book book2 = new Book("Собачье сердце", "Михаил Булгаков", 1922);
        Book book3 = new Book("Бойцовский клуб", "Чак Паланик", 1901);
        Book book4 = new Book("Букварь", "неизвестный автор", 1900);


        Reader reader1 = new Reader("Иванов Иван.", "0002", "ИНФОРМАЦИОННЫЙ", 1993, "380-00-00-00");
        Reader reader2 = new Reader("Петров Петр", "0015", "ИНФОРМАЦИОННЫЙ", 1992, "380-00-00-01");
        Reader reader3 = new Reader("Сидоров Сидор", "0111", "ИНФОРМАЦИОННЫЙ", 1991, "380-00-00-02");

        // конец блока конструкторов
        
        System.out.println("Читатели в библиотеке:");
        System.out.println("1. " + reader1.getInfo());
        System.out.println("2. " + reader2.getInfo());
        System.out.println("3. " + reader3.getInfo());

        System.out.println("Книги в наличии:");
        System.out.println("1. " + book1.getInfo());
        System.out.println("2. " + book2.getInfo());
        System.out.println("3. " + book3.getInfo());
        System.out.println("4. " + book4.getInfo());

        reader1.takeBook(reader1.getFio(), 3);

        String[] array = new String[4];
        array[0] = book1.getNameBook();
        array[1] = book2.getNameBook();
        array[2] = book3.getNameBook();
        array[3] = book4.getNameBook();
        reader2.takeBook(reader2.getFio(), Arrays.toString(array).replace("[", "").replace("]", ""));

        reader3.takeBook(reader3.getFio());
        System.out.println(book1.getInfo() + ", " + book2.getInfo() + ", " + book3.getInfo() + ", "
                + book4.getInfo());

        reader1.returnBook(reader1.getFio(), 2);

        reader2.returnBook(reader2.getFio(), Arrays.toString(array).replace("[", "").replace("]", ""));
        reader3.returnBook(reader3.getFio());
        System.out.println(book1.getInfo() + ", " + book2.getInfo() + ", " + book3.getInfo() + ", "
                + book4.getInfo());
    }
}
