package net.weg.attpratica.controller;

import lombok.AllArgsConstructor;
import net.weg.attpratica.model.Disciplina;
import net.weg.attpratica.service.DisciplinaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("disciplina")
public class DisciplinaController {
    private DisciplinaService disciplinaService;
    @PostMapping
    public void adicionar(@RequestBody Disciplina Disciplina){
        disciplinaService.salvar(Disciplina);
    }

    @PutMapping
    public void atualizar(@RequestParam Integer id){
        disciplinaService.salvar(disciplinaService.buscarUm(id));
    }

    @DeleteMapping
    public void deletar(@RequestParam Integer id){
        disciplinaService.deletar(id);
    }

    @GetMapping("/todasDisciplinas")
    public List<Disciplina> buscarTodos(){
        return disciplinaService.buscarTodos();
    }

    @GetMapping
    public Disciplina buscarTodos(@RequestParam Integer id){
        return disciplinaService.buscarUm(id);
    }
}
