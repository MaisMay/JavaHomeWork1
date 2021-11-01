package com.pb.tkachuk.hw5;
/*
Класс Reader хранит такую информацию о пользователе библиотеки:
- ФИО
- номер читательского билета
- факультет
- дата рождения
- телефон
Типы полей выбирать на свое усмотрение.
 */


public class Reader {
    private String fio;
    private String numberTiket;
    private String faculty;
    private int yearBorn;
    private String numberPhone;

    public Reader(String fio, String numberTiket, String faculty, int yearBorn, String numberPhone) {
        this.fio = fio;
        this.numberTiket = numberTiket;
        this.faculty = faculty;
        this.yearBorn = yearBorn;
        this.numberPhone = numberPhone;
    }
    // тут будут вызовы методов
    public String getFio() {
        return fio;
    }

    public String getFaculty() {
        return faculty;
    }
    public String getNumberTiket() {
        return numberTiket;

    }
    public String getNumberPhone() {
        return numberPhone;
    }
    public int getYearBorn() {
        return yearBorn;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setNumberTiket(String numberTiket) {
        this.numberTiket = numberTiket;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    // блок вернул - отдал


    public void takeBook(String nameReader, int count) {
        System.out.println(nameReader + " взял " + count + " книги" );
    }
    public void takeBook(String nameReader, String nameBook) {
        System.out.println(nameReader + " взял книги: " + nameBook);
    }
    public void takeBook(String nameReader) {
        System.out.print(nameReader + " взял книги: ");
    }
    public void returnBook(String nameReader, int count1) {
        System.out.println(nameReader + " вернул " + count1 + " книги" );
    }
    public void returnBook(String nameReader, String nameBook) {
        System.out.println(nameReader + " вернул книги: " + nameBook);
    }
    public void returnBook(String nameReader) {
        System.out.print(nameReader + " вернул книги: ");
    }
    String getInfo() {
        return "ФИО: " + fio + ", номер читательского билета: " + numberTiket + ", факультет: "
                + faculty + ", дата рождения: " + yearBorn + ", телефон: " + numberPhone;
    }
}