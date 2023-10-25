package net.weg.attpratica.repository;

import net.weg.attpratica.model.Diretor;
import net.weg.attpratica.model.UserIdCpf;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiretorRepository extends JpaRepository<Diretor, UserIdCpf> {
}
