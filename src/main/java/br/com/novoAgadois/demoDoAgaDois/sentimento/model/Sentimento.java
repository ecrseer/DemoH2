package br.com.novoAgadois.demoDoAgaDois.sentimento.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sentimento {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE) Long idSent;
    String nome;
    String localizacao;



    public Long getIdSent() {
        return idSent;
    }

    public void setIdSent(Long idSent) {
        this.idSent = idSent;
    }

    public Sentimento(){
        super();
    }
}
