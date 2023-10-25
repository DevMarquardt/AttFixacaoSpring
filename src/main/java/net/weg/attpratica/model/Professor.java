package net.weg.attpratica.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_professor")

public class Professor extends Usuario{

    @ManyToOne
    private Escola escola;
    @ManyToMany(mappedBy = "listaDeProfessores")
    private List<Disciplina> listaDeDisciplinas;
}
