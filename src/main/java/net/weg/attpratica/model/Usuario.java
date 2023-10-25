package net.weg.attpratica.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_usuario")
@Inheritance(strategy = InheritanceType.JOINED)
@IdClass(UserIdCpf.class)
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    @Id
    private Long cpf;
    private String nome;
    private String email;
    private String telefone;
    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

}
