package com.xavier.contagestapi.repository;


import com.xavier.contagestapi.model.Diario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DiarioRepository extends JpaRepository<Diario, Integer> {

    Optional<Diario> findByDesignacaoIgnoreCase(String designacao);
}
