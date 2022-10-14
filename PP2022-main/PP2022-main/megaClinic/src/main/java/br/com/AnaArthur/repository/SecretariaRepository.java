package br.com.AnaArthur.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.AnaArthur.model.Secretaria;

@Repository
public interface SecretariaRepository extends JpaRepository<Secretaria, Long>{
    
}
