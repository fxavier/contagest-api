package com.xavier.contagestapi.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "plano_conta")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PlanoConta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "id_plano")
    private Integer planoId;

    @NotBlank(message = "plano-1")
    private String codigo;

    @NotBlank(message = "plano-2")
    private String descricao;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_movimento")
    @NotBlank(message = "plano-3")
    private TipoMovimento tipoMovimento;

    @ManyToOne
    @JoinColumn(name = "codigo_ano")
    private AnoFiscal anoFiscal;

    private String observacao;
}
