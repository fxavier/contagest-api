package com.xavier.contagestapi.service.exception;

import org.springframework.http.HttpStatus;

public class DiarioExistenteException extends BusnessException {
    public DiarioExistenteException() {
        super("diario-4", HttpStatus.BAD_REQUEST);
    }
}
