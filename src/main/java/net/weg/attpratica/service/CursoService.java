package net.weg.attpratica.service;

import lombok.AllArgsConstructor;
import net.weg.attpratica.model.Curso;
import net.weg.attpratica.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CursoService {
    private CursoRepository cursoRepository;

    public void salvar(Curso curso) {
        cursoRepository.save(curso);
    }

    public void deletar(Integer id) {
        cursoRepository.deleteById(id);
    }

    public Curso buscarUm(Integer id) {
        return cursoRepository.findById(id).get();
    }

    public List<Curso> buscarTodos() {
        return cursoRepository.findAll();
    }
}
