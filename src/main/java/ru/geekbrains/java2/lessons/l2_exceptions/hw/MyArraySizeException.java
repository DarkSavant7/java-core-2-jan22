package ru.geekbrains.java2.lessons.l2_exceptions.hw;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(String message) {
        super(message);
    }
}
