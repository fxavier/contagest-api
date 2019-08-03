package com.xavier.contagestapi.service;

import com.xavier.contagestapi.model.Documento;
import com.xavier.contagestapi.repository.DocumentoRepository;
import com.xavier.contagestapi.service.exception.DocumentoExisteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DocumentService {

    @Autowired
    private DocumentoRepository documentoRepository;

    public Documento salvar(final Documento documento) {
        verifyIfExists(documento);

        return documentoRepository.save(documento);
    }

    private void verifyIfExists(Documento documento) {
        Optional<Documento> foundDocumento = documentoRepository.findByNomeIgnoreCase(documento.getNome());
        if(foundDocumento.isPresent() && documento.isNovo()) {
            throw new DocumentoExisteException();
        }
    }
}
