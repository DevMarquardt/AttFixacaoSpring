package net.weg.attpratica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_diretor")
public class Diretor extends Usuario{
    @OneToOne(mappedBy = "diretor")
    private Escola escola;
}
