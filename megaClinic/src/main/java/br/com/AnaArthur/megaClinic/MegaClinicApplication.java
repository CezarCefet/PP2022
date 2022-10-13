package br.com.AnaArthur.megaClinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.AnaArthur.model.Paciente;

@SpringBootApplication
public class MegaClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(MegaClinicApplication.class, args);
		Paciente p = new Paciente();
	}

}
