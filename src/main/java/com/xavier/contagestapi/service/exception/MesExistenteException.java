package com.xavier.contagestapi.service.exception;

import org.springframework.http.HttpStatus;

public class MesExistenteException extends BusnessException {
    public MesExistenteException() {
        super("mes-3", HttpStatus.BAD_REQUEST);
    }
}
