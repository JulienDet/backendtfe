package com.tfe.detcorp.controllers;

import com.tfe.detcorp.entities.Article;
import com.tfe.detcorp.entities.Employe;
import com.tfe.detcorp.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/articles")
public class ArticleController {
    @Autowired
    private ArticleRepository articleRepository;

    @PostMapping(value="/addArticle", consumes = "application/json", produces = "application/json")
    public @ResponseBody Article addNewArticle (@RequestBody Article article) {
        return articleRepository.save(article);
    }

    @GetMapping(path="/allArticle")
    public @ResponseBody Iterable<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    @PostMapping(path="/findArticle")
    public @ResponseBody Article getArticle(@RequestParam String nomArticle){
        return articleRepository.findByNomArticle(nomArticle);
    }
}
