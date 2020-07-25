package br.com.novoAgadois.demoDoAgaDois.Controles;

import br.com.novoAgadois.demoDoAgaDois.Muitici.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoPessImplem implements ServicoPessoa {
    @Autowired
    private RepoPessoa reposito;


    @Override
    public List<Pessoa> findAll() {
        return reposito.findAll();
    }

    @Override
    public Pessoa save(Pessoa pes) {
        return this.reposito.save(pes);
    }
}
