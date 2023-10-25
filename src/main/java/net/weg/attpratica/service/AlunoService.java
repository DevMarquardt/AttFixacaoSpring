package net.weg.attpratica.service;

import lombok.AllArgsConstructor;
import net.weg.attpratica.model.Aluno;
import net.weg.attpratica.model.Curso;
import net.weg.attpratica.model.UserIdCpf;
import net.weg.attpratica.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AlunoService {
    private AlunoRepository alunoRepository;

    public void salvar(Aluno aluno) {
        alunoRepository.save(aluno);
    }

    public void deletar(Long id,Long cpf) {
        alunoRepository.deleteById(new UserIdCpf(id,cpf));
    }

    public Aluno buscarUm(Long id,Long cpf) {
        return alunoRepository.findById(new UserIdCpf(id,cpf)).get();
    }

    public List<Aluno> buscarTodos() {
        return alunoRepository.findAll();
    }
}
