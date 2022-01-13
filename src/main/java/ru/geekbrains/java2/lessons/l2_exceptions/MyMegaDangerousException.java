package ru.geekbrains.java2.lessons.l2_exceptions;

public class MyMegaDangerousException extends RuntimeException {
    public MyMegaDangerousException() {
        super();
    }

    public MyMegaDangerousException(String message) {
        super(message);
    }

}
