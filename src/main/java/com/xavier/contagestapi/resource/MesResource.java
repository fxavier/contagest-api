package com.xavier.contagestapi.resource;

import com.xavier.contagestapi.model.MesContabilistico;
import com.xavier.contagestapi.repository.MesContabilisticoRepository;
import com.xavier.contagestapi.service.MesContabilisticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/meses")
public class MesResource {

    @Autowired
    private MesContabilisticoService service;

    @Autowired
    private MesContabilisticoRepository repository;

    @GetMapping
    public List<MesContabilistico> findAll() {
        return repository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MesContabilistico create(@Valid @RequestBody MesContabilistico mesContabilistico) {
        return service.salvar(mesContabilistico);
    }
}
