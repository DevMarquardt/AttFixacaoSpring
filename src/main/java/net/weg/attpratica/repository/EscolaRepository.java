package net.weg.attpratica.repository;

import net.weg.attpratica.model.Escola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscolaRepository extends JpaRepository<Escola, Integer> {
}
