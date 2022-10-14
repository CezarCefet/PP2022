package br.com.AnaArthur.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.AnaArthur.model.Consulta;
import br.com.AnaArthur.repository.ConsultaRepository;

public class ConsultaService {
    
    
    @Autowired
    ConsultaRepository consultaRepository;

    public Optional<Consulta> findById(Long id){
        return consultaRepository.findById(id);
    }

    public List<Consulta> findAll(){
        return consultaRepository.findAll();
    }

    public void delete(long id){
        consultaRepository.deleteById(id);
    }

    public Consulta save(Consulta consulta){
        return consultaRepository.save(consulta);
    }
}
