package com.tfe.detcorp.repositories;

import com.tfe.detcorp.entities.Commande;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommandeRepository extends CrudRepository<Commande,Integer> {
    /*@Query ("select c  from Commande c join fetch c.listeArticle where c.idCommande = :idCommande" )
    Commande findCommandeWithArticle(@Param("idCommande") Integer idCommande);*/


}
