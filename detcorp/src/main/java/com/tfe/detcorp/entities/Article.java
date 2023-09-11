package com.tfe.detcorp.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer iD_Article;
    private String nomArticle;
    private double volume;
    private double poids;

}
