package net.weg.attpratica.repository;

import net.weg.attpratica.model.Aluno;
import net.weg.attpratica.model.UserIdCpf;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, UserIdCpf> {
}
