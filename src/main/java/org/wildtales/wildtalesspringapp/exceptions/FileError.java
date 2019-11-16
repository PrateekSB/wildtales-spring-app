package org.wildtales.wildtalesspringapp.exceptions;

public class FileError extends RuntimeException {
    public FileError(String message, Throwable e) {
        super(message, e);
    }
}
