package br.com.novoAgadois.demoDoAgaDois.sentimento.repository;

import br.com.novoAgadois.demoDoAgaDois.sentimento.model.Sentimento;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SentimentoRepository extends CrudRepository<Sentimento,Long> {

    List<Sentimento> findAll();

}
