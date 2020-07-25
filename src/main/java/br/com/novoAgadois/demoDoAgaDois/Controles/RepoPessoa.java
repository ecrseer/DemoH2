package br.com.novoAgadois.demoDoAgaDois.Controles;

import br.com.novoAgadois.demoDoAgaDois.Muitici.Pessoa;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepoPessoa extends CrudRepository<Pessoa,Integer> {

    List<Pessoa> findAll();
}
