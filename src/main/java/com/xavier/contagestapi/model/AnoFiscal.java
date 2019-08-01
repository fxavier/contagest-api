package com.xavier.contagestapi.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "year")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Year {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "id")
    private Integer yearId;

    @NotBlank(message = "year-1")
    private String yearName;
}
