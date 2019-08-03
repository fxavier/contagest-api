package com.xavier.contagestapi.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "diario")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Diario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
    private Integer codigo;

    @NotBlank(message = "diario-1")
    private String designacao;

    @NotNull(message = "diario-2")
    @ManyToOne
    @JoinColumn(name = "codigo_ano")
    private AnoFiscal anoFiscal;

    @Column(name = "numero_proximo")
    private String numeroProximo;

    @NotNull(message = "diario-3")
    @ManyToOne
    @JoinColumn(name = "codigo_documento")
    private Documento documento;

    @Column(name = "credito_movimento")
    private BigDecimal creditoMovimento;

    @Column(name = "debito_movimento")
    private BigDecimal debitoMovimento;

    @Transient
    public Boolean isNovo() {
        return this.codigo == null;
    }

    @Transient
    public Boolean isExiste() {
        return this.codigo != null;
    }
}
