package br.com.AnaArthur.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity( name = "tbPaciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column( name = "nome", length = 200, nullable = false)
    private String nome;


    @Column( name = "nomeResponsavel", length = 200, nullable = false)
    private String nomeResponsavel;

    private String dataNasc;
    private String CPF;
    private String numeroTelefone;
    private String endereco;
    private String sexo;

    @OneToMany
    private Consulta consulta;

}
