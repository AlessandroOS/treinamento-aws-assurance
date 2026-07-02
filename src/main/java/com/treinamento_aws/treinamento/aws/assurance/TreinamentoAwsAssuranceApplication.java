package com.treinamento_aws.treinamento.aws.assurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TreinamentoAwsAssuranceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TreinamentoAwsAssuranceApplication.class, args);
	}

	@GetMapping("/teste")
	public String meuEndpoint() {
		return "Olá da instância EC2 da AWS! O endpoint funcionou com sucesso.";
	}
}
