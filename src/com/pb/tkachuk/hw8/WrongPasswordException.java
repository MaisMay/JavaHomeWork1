package com.pb.tkachuk.hw8;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
    }
    // второй принимает сообщение и передает его в конструктор класса Exception.
    public WrongPasswordException(String message) {
        super(message);
    }
}