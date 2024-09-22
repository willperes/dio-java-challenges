package com.willperes.iphone.exception;

public class NoCurrentSongException extends RuntimeException {
    public NoCurrentSongException(String message) {
        super(message);
    }
}
