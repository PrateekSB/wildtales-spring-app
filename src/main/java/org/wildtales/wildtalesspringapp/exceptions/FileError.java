package org.wildtales.wildtalesspringapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class FileError extends RuntimeException {
    public FileError(String message, Throwable e) {
        super(message, e);
    }
}
