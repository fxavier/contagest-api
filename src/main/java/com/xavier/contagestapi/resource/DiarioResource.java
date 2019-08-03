package com.xavier.contagestapi.resource;

import com.xavier.contagestapi.model.Diario;
import com.xavier.contagestapi.repository.DiarioRepository;
import com.xavier.contagestapi.service.DiarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/diarios")
public class DiarioResource {

    @Autowired
    private DiarioRepository diarioRepository;

    @Autowired
    private DiarioService diarioService;

    @GetMapping
    public List<Diario> findAll() {
        return diarioRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Diario create(@Valid @RequestBody Diario diario) {
        return diarioService.salvar(diario);
    }

}
