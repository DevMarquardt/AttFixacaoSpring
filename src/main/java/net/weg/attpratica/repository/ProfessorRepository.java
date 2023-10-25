package net.weg.attpratica.repository;

import net.weg.attpratica.model.Professor;
import net.weg.attpratica.model.UserIdCpf;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, UserIdCpf> {
}
