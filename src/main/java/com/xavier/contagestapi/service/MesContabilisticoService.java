package com.xavier.contagestapi.service;

import com.xavier.contagestapi.model.MesContabilistico;
import com.xavier.contagestapi.repository.MesContabilisticoRepository;
import com.xavier.contagestapi.service.exception.MesExistenteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MesContabilisticoService {

    @Autowired
    private MesContabilisticoRepository mesContabilisticoRepository;

    public MesContabilistico salvar(final MesContabilistico mes) {
        verifyIfExists(mes);

        return mesContabilisticoRepository.save(mes);
    }

    private void verifyIfExists(MesContabilistico mes) throws MesExistenteException {
        Optional<MesContabilistico> foundMes = mesContabilisticoRepository.findByNome(mes.getNome());
        if(foundMes.isPresent() && mes.isNovo()) {
            throw new MesExistenteException();
        }
    }


}
