package br.com.novoAgadois.demoDoAgaDois.Controles;

import br.com.novoAgadois.demoDoAgaDois.Muitici.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServicoPessImplem implements ServicoPessoa {
    @Autowired RepoPessoa reposito;


    @Override
    public List<Pessoa> findAll() {
        return null;
    }

    @Override
    public Pessoa save(Pessoa pes) {
        return this.reposito.save(pes);
    }
}
