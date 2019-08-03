package com.xavier.contagestapi.repository;


import com.xavier.contagestapi.model.MesContabilistico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MesContabilisticoRepository extends JpaRepository<MesContabilistico, Integer> {

    Optional<MesContabilistico> findByNome(String nome);
}
