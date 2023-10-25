package net.weg.attpratica.controller;

import lombok.AllArgsConstructor;
import net.weg.attpratica.model.Aluno;
import net.weg.attpratica.service.AlunoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("aluno")
@AllArgsConstructor
public class AlunoController {

    private AlunoService alunoService;

    @PostMapping
    public void adicionar(@RequestBody Aluno aluno) {
        alunoService.salvar(aluno);
    }

    @PutMapping
    public void atualizar(@RequestBody Aluno aluno) {
        alunoService.salvar(aluno);
    }

    @DeleteMapping
    public void deletar(@RequestParam Long id, @RequestParam Long cpf) {
        alunoService.deletar(id, cpf);
    }

    @GetMapping("/todosAlunos")
    public List<Aluno> buscarTodos() {
        return alunoService.buscarTodos();
    }

    @GetMapping
    public Aluno buscarUm(@RequestParam Long id, @RequestParam Long cpf) {
        return alunoService.buscarUm(id, cpf);
    }
}
