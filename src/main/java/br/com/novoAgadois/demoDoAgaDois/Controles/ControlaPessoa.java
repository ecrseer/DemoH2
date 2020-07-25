package br.com.novoAgadois.demoDoAgaDois.Controles;

import br.com.novoAgadois.demoDoAgaDois.Muitici.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class ControlaPessoa {
    @Autowired
    ServicoPessoa servico;

    public Iterable<Pessoa> findAll(){return servico.findAll();}

    @PostMapping
    public Pessoa save(@RequestBody Pessoa pes){return servico.save(pes);}

}
