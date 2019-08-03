package com.xavier.contagestapi.resource;

import com.xavier.contagestapi.model.AnoFiscal;
import com.xavier.contagestapi.repository.AnoFiscalRepository;
import com.xavier.contagestapi.service.AnoFiscalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/anos")
public class AnoFiscalResource {

    @Autowired
    private AnoFiscalRepository anoFiscalRepository;

    @Autowired
    private AnoFiscalService anoFiscalService;

    @GetMapping
    public List<AnoFiscal> findAll() {
        return anoFiscalRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AnoFiscal create(@Valid @RequestBody AnoFiscal anoFiscal) {
        return anoFiscalService.salvar(anoFiscal);
    }
}
