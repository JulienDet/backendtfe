package com.tfe.detcorp.repositories;

import com.tfe.detcorp.entities.Article;
import com.tfe.detcorp.entities.Commande;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArticleRepository extends CrudRepository<Article,Integer> {
    @Transactional
    void deleteByIdArticle(Integer idArticle);

    Article findByIdArticle(Integer idArticle);

    /*@Query ("select a from Article a join fetch a.commandes c where c.idCommande = :idCommande" )
    List<Article> findByIdCommande(@Param("idCommande") Integer idCommande);*/


}

