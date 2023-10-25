package net.weg.attpratica.controller;

import lombok.AllArgsConstructor;
import net.weg.attpratica.model.Diretor;
import net.weg.attpratica.service.DiretorService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("diretor")
@AllArgsConstructor
public class DiretorController {

    private DiretorService diretorService;

    @PostMapping
    public void adicionar(@RequestBody Diretor diretor) {
        diretorService.salvar(diretor);
    }

    @PutMapping
    public void atualizar(@RequestBody Diretor diretor) {
        diretorService.salvar(diretor);
    }

    @DeleteMapping
    public void deletar(@RequestParam Long id, @RequestParam Long cpf) {
        diretorService.deletar(id, cpf);
    }

    @GetMapping("/todosDiretores")
    public List<Diretor> buscarTodos() {
        return diretorService.buscarTodos();
    }

    @GetMapping
    public Diretor buscarUm(@RequestParam Long id, @RequestParam Long cpf) {
        return diretorService.buscarUm(id, cpf);
    }
}