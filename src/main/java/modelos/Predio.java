package modelos;

import javax.persistence.*;

@Entity
public class Predio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int idP;


    int idCid;



    String ruaDP;
    int andaresx;
}
