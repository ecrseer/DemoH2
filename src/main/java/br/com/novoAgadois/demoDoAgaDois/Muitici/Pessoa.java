package br.com.novoAgadois.demoDoAgaDois.Muitici;

import org.hibernate.loader.collection.OneToManyJoinWalker;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)

public class Pessoa {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE) int id;
    String nome;

    /*@OneToOne
    @JoinColumn(name = "CORPO_ID")
    Corpo corpo;*/


    @OneToMany
    @JoinColumn(name = "hobbie_ID")
    List<Hobbie> idHobie;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /*public Corpo getCorpo() {
        return corpo;
    }

    public void setCorpo(Corpo corpo) {
        this.corpo = corpo;
    }*/
/*

    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "altura", column = @Column(name = "AltURA_Corpo"))

    })
    private Corpo tipoCorpo;
*/



}
