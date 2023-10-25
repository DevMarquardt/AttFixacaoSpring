package net.weg.attpratica.service;

import lombok.AllArgsConstructor;
import net.weg.attpratica.model.Diretor;
import net.weg.attpratica.model.UserIdCpf;
import net.weg.attpratica.repository.DiretorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class DiretorService {
    private DiretorRepository diretorRepository;

    public void salvar(Diretor diretor) {
        diretorRepository.save(diretor);
    }

    public void deletar(Long id,Long cpf) {
        diretorRepository.deleteById(new UserIdCpf(id,cpf));
    }

    public Diretor buscarUm(Long id,Long cpf) {
        return diretorRepository.findById(new UserIdCpf(id,cpf)).get();
    }

    public List<Diretor> buscarTodos() {
        return diretorRepository.findAll();
    }
}
