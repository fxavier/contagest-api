package com.xavier.contagestapi.service.exception;

import org.springframework.http.HttpStatus;

public class AnoFiscalExistenteException extends BusnessException {

    public AnoFiscalExistenteException() {
        super("ano-2", HttpStatus.BAD_REQUEST);
    }
}
