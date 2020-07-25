package br.com.novoAgadois.demoDoAgaDois.sentimento.controller;


import br.com.novoAgadois.demoDoAgaDois.sentimento.model.Sentimento;
import br.com.novoAgadois.demoDoAgaDois.sentimento.service.SentimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sentimento")
public class SentimentoController {

    @Autowired
    private SentimentoService sentimentoService;

    @PostMapping
    public Sentimento save(@RequestBody Sentimento sentimen){return this.sentimentoService.save(sentimen)}
    @GetMapping
    public Iterable<Sentimento> findAll(){
        return this.sentimentoService.findAll();
    }
}
