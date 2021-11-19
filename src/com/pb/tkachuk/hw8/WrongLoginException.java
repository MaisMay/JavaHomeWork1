package com.pb.tkachuk.hw8;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
    }
    // второй принимает сообщение и передает его в конструктор класса Exception.
    public WrongLoginException(String message) {
        super(message);
    }

}