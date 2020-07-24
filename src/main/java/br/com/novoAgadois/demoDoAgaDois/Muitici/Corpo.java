package br.com.novoAgadois.demoDoAgaDois.Muitici;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity

public class Corpo {
    @Id
    int idCorpo;


    int altura;

    /*@OneToOne
    @JoinColumn(name = "Pessoa_ID")
    Pessoa pessoas;*/
}
