package com.xavier.contagestapi.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "mes_contabilistico")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class MesContabilistico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
    @Column(name = "id_mes")
    private Integer id;

    @NotBlank(message = "mes-1")
    private String codigo;
    @NotBlank(message = "mes-2")
    private String nome;

    @Transient
    public Boolean isNovo() {
        return this.codigo == null;
    }

    @Transient
    public Boolean isExist() {
        return this.codigo != null;
    }
}
