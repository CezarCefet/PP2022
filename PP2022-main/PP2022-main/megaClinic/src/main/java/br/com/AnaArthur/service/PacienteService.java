package br.com.AnaArthur.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.AnaArthur.model.Paciente;
import br.com.AnaArthur.repository.PacienteRepository;

@Service
public class PacienteService {

    @Autowired
    PacienteRepository pacienteRepository;

    public Optional<Paciente> findById(Long id) {
        return pacienteRepository.findById(id);
    }

    public List<Paciente> findAll() {
        return pacienteRepository.findAll();
    }

    public void delete(long id) {
        pacienteRepository.deleteById(id);
    }

    public Paciente save(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }
}
