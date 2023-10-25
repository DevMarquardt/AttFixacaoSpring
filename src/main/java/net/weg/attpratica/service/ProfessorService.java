package net.weg.attpratica.service;

import lombok.AllArgsConstructor;
import net.weg.attpratica.model.Professor;
import net.weg.attpratica.model.UserIdCpf;
import net.weg.attpratica.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ProfessorService {
    private ProfessorRepository professorRepository;

    public void salvar(Professor professor) {
        professorRepository.save(professor);
    }

    public void deletar(Long id,Long cpf) {
        professorRepository.deleteById(new UserIdCpf(id,cpf));
    }

    public Professor buscarUm(Long id,Long cpf) {
        return professorRepository.findById(new UserIdCpf(id,cpf)).get();
    }

    public List<Professor> buscarTodos() {
        return professorRepository.findAll();
    }
}
