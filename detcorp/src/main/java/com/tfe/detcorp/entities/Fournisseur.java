package com.tfe.detcorp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Fournisseur {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer idFournisseur;
    private String nomFournisseur;
    @OneToMany(mappedBy = "fournisseur")
    private List<Commande> listeCommande;
}
