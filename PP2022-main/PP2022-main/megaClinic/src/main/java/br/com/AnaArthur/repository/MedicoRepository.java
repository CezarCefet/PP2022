package br.com.AnaArthur.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.AnaArthur.model.Medico;

public interface MedicoRepository extends JpaRepository<Medico,Long>{
    
}
