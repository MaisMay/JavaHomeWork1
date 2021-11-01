package com.pb.tkachuk.hw5;

/*
Класс Book хранит такую информацию о книге:
- название
- автор книги
- год издания
 */

public class Book {
    private static int Count = 0;

    public static int getCount() {
        return  Count;
    }
    private String nameBook;
    private String authorBook;
    private int year;

    public Book(String nameBook, String authorBook, int year) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.year = year;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    String getInfo() {
        return nameBook + " (" + authorBook + " "
                + year + ")";
    }
}