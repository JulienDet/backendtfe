package com.tfe.detcorp.repositories;

import com.tfe.detcorp.entities.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article,Integer> {
    Article findByNomArticle(String nomArticle);
}
