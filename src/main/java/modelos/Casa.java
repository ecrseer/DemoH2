package modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Casa implements Residencia {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;
    String nome;
    int ano;
}
