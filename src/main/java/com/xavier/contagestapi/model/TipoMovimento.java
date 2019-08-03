package com.xavier.contagestapi.model;

import lombok.Getter;

public enum TipoMovimento {

    RAZAO("Razao"),
    INTEGRACAO("Integracao"),
    MOVIMENTO("Movimento");

    @Getter
    private String descricao;

    TipoMovimento(String descricao) {
        this.descricao = descricao;
    }


}
