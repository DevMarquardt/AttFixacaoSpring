package net.weg.attpratica.service;

import lombok.AllArgsConstructor;
import net.weg.attpratica.model.Turma;
import net.weg.attpratica.repository.TurmaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class TurmaService {
    private TurmaRepository turmaRepository;

    public void salvar(Turma turma) {
        turmaRepository.save(turma);
    }

    public void deletar(Integer id) {
        turmaRepository.deleteById(id);
    }

    public Turma buscarUm(Integer id) {
        return turmaRepository.findById(id).get();
    }

    public List<Turma> buscarTodos() {
        return turmaRepository.findAll();
    }
}
