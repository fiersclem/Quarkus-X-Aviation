package org.acme.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "MOTEURS")
public class Moteur extends PanacheEntityBase {
    @Id
    @Column(name = "ID_MOTEUR")
    public String id;
    
    public String fabricant;
    public String modele;
    public Double poussee;
}