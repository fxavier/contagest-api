package com.xavier.contagestapi.repository;

import com.xavier.contagestapi.model.Documento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DocumentoRepository extends JpaRepository<Documento, Integer> {

    Optional<Documento> findByNomeIgnoreCase(String nome);
}
