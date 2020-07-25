package br.com.novoAgadois.demoDoAgaDois.sentimento.service;

import br.com.novoAgadois.demoDoAgaDois.sentimento.model.Sentimento;

import java.util.List;

public interface SentimentoService {

    List<Sentimento> findAll();
    Sentimento save(Sentimento sen);
}
