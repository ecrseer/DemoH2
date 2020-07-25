package br.com.novoAgadois.demoDoAgaDois.Controles;

import br.com.novoAgadois.demoDoAgaDois.Muitici.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoa")
public class ControlaPessoa {
    @Autowired
    private ServicoPessoa servico;

    @GetMapping
    public Iterable<Pessoa> findAll(){return servico.findAll();}

    @PostMapping
    public Pessoa save(@RequestBody Pessoa pes){return servico.save(pes);}

}
