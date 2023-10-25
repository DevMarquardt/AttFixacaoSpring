package net.weg.attpratica.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_aluno")
public class Aluno extends Usuario{
    @ManyToOne
    private Turma turma;
}
