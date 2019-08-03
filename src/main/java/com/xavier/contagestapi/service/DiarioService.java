package com.xavier.contagestapi.service;

import com.xavier.contagestapi.model.Diario;
import com.xavier.contagestapi.repository.DiarioRepository;
import com.xavier.contagestapi.service.exception.DiarioExistenteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DiarioService {

    @Autowired
    private DiarioRepository diarioRepository;

    public Diario salvar(final Diario diario) {
        Optional<Diario> foundDiario = diarioRepository.findByDesignacaoIgnoreCase(diario.getDesignacao());
        if(foundDiario.isPresent() && diario.isNovo()) {
            throw new DiarioExistenteException();
        }

        return diarioRepository.save(diario);
    }
}
