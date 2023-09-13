package com.tfe.detcorp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class CommandeArticle {
@EmbeddedId
    private CommandeArticleKey id = new CommandeArticleKey();
    @ManyToOne
    @MapsId("idArticle")
    @JoinColumn(name = "ID_Article")
    @JsonIgnore
    private
    Article article;

    @ManyToOne
    @MapsId("idCommande")
    @JoinColumn(name = "Id_Commande")
    @JsonIgnore
    private
    Commande commande;

    private Integer quantite;

}
