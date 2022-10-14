package br.com.AnaArthur.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.AnaArthur.model.Secretaria;
import br.com.AnaArthur.repository.SecretariaRepository;

public class SecretariaService {
    
    @Autowired
    SecretariaRepository secretariaRepository;

    public Optional<Secretaria> findById(Long id){
        return secretariaRepository.findById(id);
    }

    public List<Secretaria> findAll(){
        return secretariaRepository.findAll();
    }

    public void delete(long id){
        secretariaRepository.deleteById(id);
    }

    public Secretaria save(Secretaria secretaria){
        return secretariaRepository.save(secretaria);
    }
    
}
