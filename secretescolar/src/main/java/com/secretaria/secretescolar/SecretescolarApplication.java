package com.secretaria.secretescolar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.secretaria.secretescolar.model.Aluno;

@SpringBootApplication
public class SecretescolarApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecretescolarApplication.class, args);
		Aluno aluno1 = new Aluno("Ana", 17);
        aluno1.setId(1);
        aluno1.exibirInfo();
	
	
	}

}
