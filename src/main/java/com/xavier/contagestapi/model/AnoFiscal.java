package com.xavier.contagestapi.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ano_fiscal")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class AnoFiscal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer codigo;

    @NotNull(message = "ano-1")
    private Integer nome;

    @Transient
    public Boolean isNovo() {
        return this.codigo == null;
    }

    @Transient Boolean isExiste() {
        return  this.codigo != null;
    }
}
