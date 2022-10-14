package br.com.AnaArthur.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.AnaArthur.repository.MedicoRepository;

import br.com.AnaArthur.model.Medico;


public class MedicoService {

    @Autowired
    MedicoRepository medicoRepository;

    public Optional<Medico> findById(Long id){
        return medicoRepository.findById(id);
    }

    public List<Medico> findAll(){
        return medicoRepository.findAll();
    }

    public void delete(long id){
        medicoRepository.deleteById(id);
    }

    public Medico save(Medico medico){
        return medicoRepository.save(medico);
    }
    
}
