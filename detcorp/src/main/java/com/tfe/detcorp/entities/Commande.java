package com.tfe.detcorp.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode
public class Commande {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer idCommande;
    @ManyToOne
    @JoinColumn(name="Id_Fournisseur")
    @JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="idFournisseur")
    @JsonIdentityReference(alwaysAsId=true)
    private Fournisseur fournisseur;

   /* @ManyToMany(mappedBy = "commandes",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Article> articles;*/

    @OneToMany(mappedBy = "commande")
    private Set<CommandeArticle> articles;
}
