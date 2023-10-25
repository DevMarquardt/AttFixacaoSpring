package net.weg.attpratica.service;

import lombok.AllArgsConstructor;
import net.weg.attpratica.model.Disciplina;
import net.weg.attpratica.repository.DisciplinaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DisciplinaService{
    private DisciplinaRepository disciplinaRepository;

    public void salvar(Disciplina disciplina) {
        disciplinaRepository.save(disciplina);
    }

    public void deletar(Integer id) {
        disciplinaRepository.deleteById(id);
    }

    public Disciplina buscarUm(Integer id) {
        return disciplinaRepository.findById(id).get();
    }

    public List<Disciplina> buscarTodos() {
        return disciplinaRepository.findAll();
    }
}
