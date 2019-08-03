package com.xavier.contagestapi.service.exception;

import org.springframework.http.HttpStatus;

public class DocumentoExisteException extends BusnessException {


    public DocumentoExisteException() {
        super("documento-2", HttpStatus.BAD_REQUEST);
    }
}
