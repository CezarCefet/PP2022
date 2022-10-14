package br.com.AnaArthur.model;


import java.math.BigDecimal;
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
@Entity( name = "tbConsulta")
public class Consulta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nomePaciente;
    private String telefonePaciente;
    private String dataConsulta;
    private String horaComeco;
    private String horaFinal;
 
    private String nomeMedico;
    private BigDecimal valorConsulta;
  
    private String observacoes;

    @ManyToOne
    @JoinColumn(name="Paciente", nullable = false)    
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name="Medico", nullable = false) 
    private Medico medico;

    @ManyToOne
    @JoinColumn(name="Secretaria", nullable = false) 
    private Secretaria secretaria;
}
