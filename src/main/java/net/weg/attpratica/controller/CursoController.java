package net.weg.attpratica.controller;

import lombok.AllArgsConstructor;
import net.weg.attpratica.model.Curso;
import net.weg.attpratica.service.CursoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("curso")
public class CursoController {

    private CursoService cursoService;
    @PostMapping
    public void adicionar(@RequestBody Curso curso){
        cursoService.salvar(curso);
    }

    @PutMapping
    public void atualizar(@RequestParam Integer id){
        cursoService.salvar(cursoService.buscarUm(id));
    }

    @DeleteMapping
    public void deletar(@RequestParam Integer id){
        cursoService.deletar(id);
    }

    @GetMapping("/todosCursos")
    public List<Curso> buscarTodos(){
        return cursoService.buscarTodos();
    }

    @GetMapping
    public Curso buscarTodos(@RequestParam Integer id){
        return cursoService.buscarUm(id);
    }
}
