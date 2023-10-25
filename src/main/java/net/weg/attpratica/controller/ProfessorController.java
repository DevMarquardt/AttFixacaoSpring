package net.weg.attpratica.controller;

import lombok.AllArgsConstructor;
import net.weg.attpratica.model.Professor;
import net.weg.attpratica.service.ProfessorService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("professor")
public class ProfessorController {
    private ProfessorService professorService;

    @PostMapping
    public void adicionar(@RequestBody Professor professor) {
        professorService.salvar(professor);
    }

    @PutMapping
    public void atualizar(@RequestBody Professor professor) {
        professorService.salvar(professor);
    }

    @DeleteMapping
    public void deletar(@RequestParam Long id, @RequestParam Long cpf) {
        professorService.deletar(id, cpf);
    }

    @GetMapping("/todosProfessores")
    public List<Professor> buscarTodos() {
        return professorService.buscarTodos();
    }

    @GetMapping
    public Professor buscarUm(@RequestParam Long id, @RequestParam Long cpf) {
        return professorService.buscarUm(id, cpf);
    }
}
