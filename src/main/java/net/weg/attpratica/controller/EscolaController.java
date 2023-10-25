package net.weg.attpratica.controller;

import lombok.AllArgsConstructor;
import net.weg.attpratica.model.Escola;
import net.weg.attpratica.service.EscolaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("escola")
public class EscolaController {
    private EscolaService escolaService;
    @PostMapping
    public void adicionar(@RequestBody Escola escola){
        escolaService.salvar(escola);
    }

    @PutMapping
    public void atualizar(@RequestParam Integer id){
        escolaService.salvar(escolaService.buscarUm(id));
    }

    @DeleteMapping
    public void deletar(@RequestParam Integer id){
        escolaService.deletar(id);
    }

    @GetMapping("/todasEscolas")
    public List<Escola> buscarTodos(){
        return escolaService.buscarTodos();
    }

    @GetMapping
    public Escola buscarTodos(@RequestParam Integer id){
        return escolaService.buscarUm(id);
    }
}
