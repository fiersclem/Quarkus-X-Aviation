package org.acme.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

@Entity
@Table(name = "AVIONS_LIGNE")
public class AvionLigne extends PanacheEntityBase {
    @Id
    @Column(name = "ID_AL")
    public String id;
    
    @Column(name = "ID_ALFULL")
    public String idFull;
    
    public String constructeur;
    public String famille;
    public String modele;
    public Integer nbremoteurs;
    
    public Double envergure;
    public Integer nbrepassmax;

    @ManyToOne
    @JoinColumn(name = "ID_MOTEUR")
    public Moteur moteur;

    @OneToMany(mappedBy = "avion")
    @JsonIgnore
    public List<FlottePassagers> exploitations;
}