package br.com.novoAgadois.demoDoAgaDois;

import br.com.novoAgadois.demoDoAgaDois.Controles.ctrlPessoa;
import br.com.novoAgadois.demoDoAgaDois.Muitici.Pessoa;
import modelos.Casa;
import modelos.Residencia;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "modelos")
public class DemoDoAgaDoisApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDoAgaDoisApplication.class, args);

		Pessoa agame = new Pessoa();
		agame.setId(23);
		agame.setNome("Almeida");

		//ctrlPessoa ctrl = new ctrlPessoa();
		//ctrl.Gravar(agame);
	}

}
