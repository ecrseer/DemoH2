package modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bairro {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int idB;

    
    String nome;
}
