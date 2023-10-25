package net.weg.attpratica.controller;

import lombok.AllArgsConstructor;
import net.weg.attpratica.model.Turma;
import net.weg.attpratica.service.TurmaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("turma")
public class TurmaController {
    private TurmaService turmaService;
    @PostMapping
    public void adicionar(@RequestBody Turma turma){
        turmaService.salvar(turma);
    }

    @PutMapping
    public void atualizar(@RequestParam Integer id){
        turmaService.salvar(turmaService.buscarUm(id));
    }

    @DeleteMapping
    public void deletar(@RequestParam Integer id){
        turmaService.deletar(id);
    }

    @GetMapping("/todasTurmas")
    public List<Turma> buscarTodos(){
        return turmaService.buscarTodos();
    }

    @GetMapping
    public Turma buscarTodos(@RequestParam Integer id){
        return turmaService.buscarUm(id);
    }
}
