package com.tfe.detcorp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer iD_Item;
    private String code_ISBN;
    private Integer iD_Commande;
    private Integer iD_Article;

}
