package br.com.AnaArthur.controller.api;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.AnaArthur.model.Paciente;
import br.com.AnaArthur.service.PacienteService;

@Controller
@RequestMapping("api/v1/paciente")
public class PacienteController {

    private static PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService) {
        PacienteController.pacienteService = pacienteService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> getPaciente(@PathVariable Long id) {
        Optional<Paciente> pacienteOp = pacienteService.findById(id);
        if (pacienteOp.isPresent()) {
            return ResponseEntity.ok().body(pacienteOp.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/")
    public ResponseEntity<List<Paciente>> getPacientes() {

    }
}
