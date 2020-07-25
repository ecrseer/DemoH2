package br.com.novoAgadois.demoDoAgaDois.Controles;

import br.com.novoAgadois.demoDoAgaDois.Muitici.Pessoa;

import java.util.List;

public interface ServicoPessoa {

    List<Pessoa> findAll();

    Pessoa save(Pessoa pes);
}
