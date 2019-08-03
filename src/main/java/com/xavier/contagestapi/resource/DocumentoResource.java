package com.xavier.contagestapi.resource;

import com.xavier.contagestapi.model.Documento;
import com.xavier.contagestapi.repository.DocumentoRepository;
import com.xavier.contagestapi.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/documentos")
public class DocumentoResource {

    @Autowired
    private DocumentoRepository documentoRepository;

    @Autowired
    private DocumentService documentService;

    @GetMapping
    public List<Documento> findAll() {
        return this.documentoRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Documento create(@Valid @RequestBody Documento documento) {
        return documentService.salvar(documento);
    }
}
