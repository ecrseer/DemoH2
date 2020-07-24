package br.com.novoAgadois.demoDoAgaDois.Muitici;

import javax.persistence.*;

@Entity
public class Hobbie {

    @Id
    int idHob;

    @ManyToOne
            @JoinColumn(name = "PESSOA_IDD")
    Pessoa pessoa;
}
