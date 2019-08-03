package com.xavier.contagestapi.repository;

import com.xavier.contagestapi.model.AnoFiscal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AnoFiscalRepository extends JpaRepository<AnoFiscal, Integer> {

    public Optional<AnoFiscal> findByNome(Integer nome);
}
