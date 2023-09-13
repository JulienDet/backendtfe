package com.tfe.detcorp.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Article {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer idArticle;
    private String nomArticle;
    private double volume;
    private double poids;
    /*@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnore
    @JoinTable(name = "asso_2", joinColumns = {
            @JoinColumn(name = "ID_Article", nullable = false) }, inverseJoinColumns = {
            @JoinColumn(name = "Id_Commande", nullable = false) })
    private List<Commande> commandes;*/

    @OneToMany(mappedBy = "article")
    private Set<CommandeArticle> articles;


}
