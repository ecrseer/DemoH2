package br.com.novoAgadois.demoDoAgaDois.sentimento.service;

import br.com.novoAgadois.demoDoAgaDois.sentimento.model.Sentimento;
import br.com.novoAgadois.demoDoAgaDois.sentimento.repository.SentimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SentimentoServiceImpl implements SentimentoService{

@Autowired private SentimentoRepository sentimentoRepository;


    @Override
    public List<Sentimento> findAll() {
        return sentimentoRepository.findAll();
    }

    @Override
    public Sentimento save(Sentimento sen) {
        return sentimentoRepository.save(sen);
    }
}
