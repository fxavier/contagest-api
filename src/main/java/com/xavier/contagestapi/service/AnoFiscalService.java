package com.xavier.contagestapi.service;

import com.xavier.contagestapi.model.AnoFiscal;
import com.xavier.contagestapi.repository.AnoFiscalRepository;
import com.xavier.contagestapi.service.exception.AnoFiscalExistenteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AnoFiscalService {

    @Autowired
    private AnoFiscalRepository anoFiscalRepository;

    public AnoFiscal salvar(final AnoFiscal anoFiscal) {
        verificaSeExiste(anoFiscal);

        return anoFiscalRepository.save(anoFiscal);
    }

    private void verificaSeExiste(AnoFiscal anoFiscal) throws AnoFiscalExistenteException {
        Optional<AnoFiscal> foundAnoFiscal = anoFiscalRepository.findByNome(anoFiscal.getNome());
        if(foundAnoFiscal.isPresent() && anoFiscal.isNovo()) {
            throw new AnoFiscalExistenteException();
        }
    }
}
