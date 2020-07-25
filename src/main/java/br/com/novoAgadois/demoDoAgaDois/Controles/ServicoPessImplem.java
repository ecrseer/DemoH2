package br.com.novoAgadois.demoDoAgaDois.Controles;

import br.com.novoAgadois.demoDoAgaDois.Muitici.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;

public class ServicoPessImplem implements ServicoPessoa {
    @Autowired RepoPessoa reposito;
    @Override
    public Pessoa save(Pessoa pes) {
        return reposito.save(pes);
    }
}
