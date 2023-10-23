package com.angularpensamentos.ApiPensamentos.controller;

import com.angularpensamentos.ApiPensamentos.domain.DadosCadastroPensamento;
import com.angularpensamentos.ApiPensamentos.domain.Pensamento;
import com.angularpensamentos.ApiPensamentos.repository.PensamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pensamentos")
public class PensamentoController {

    @Autowired
    private PensamentoRepository repository;

    @PostMapping("/cadastrar")
    public String cadastrar(@RequestBody  DadosCadastroPensamento dados){
        var pensamento = new Pensamento(dados);
        repository.save(pensamento);
        return "salvo"+pensamento;
    }
    @GetMapping("/listarpensamentos")
    public ResponseEntity<List<Pensamento>> listarPensamentos(){
        var pensamentos = repository.findAll();
        return ResponseEntity.ok(pensamentos);
    }
}
