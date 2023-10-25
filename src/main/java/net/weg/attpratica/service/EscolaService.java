package net.weg.attpratica.service;

import lombok.AllArgsConstructor;
import net.weg.attpratica.model.Escola;
import net.weg.attpratica.repository.EscolaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class EscolaService {
    private EscolaRepository escolaRepository;

    public void salvar(Escola escola) {
        escolaRepository.save(escola);
    }

    public void deletar(Integer id) {
        escolaRepository.deleteById(id);
    }

    public Escola buscarUm(Integer id) {
        return escolaRepository.findById(id).get();
    }

    public List<Escola> buscarTodos() {
        return escolaRepository.findAll();
    }
}
