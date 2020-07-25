package br.com.novoAgadois.demoDoAgaDois.Controles;

import br.com.novoAgadois.demoDoAgaDois.Muitici.Pessoa;
import org.springframework.data.repository.CrudRepository;

public interface RepoPessoa extends CrudRepository<Pessoa,int> {
}
