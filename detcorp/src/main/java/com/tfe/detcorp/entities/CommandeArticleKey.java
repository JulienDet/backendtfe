package com.tfe.detcorp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;
@Embeddable
@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommandeArticleKey implements Serializable {
    @Column(name="ID_Article")
    private Integer idArticle;
    @Column(name="Id_Commande")
    private Integer idCommande;
}
