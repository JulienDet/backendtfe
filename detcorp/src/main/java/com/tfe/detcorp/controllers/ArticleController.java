package com.tfe.detcorp.controllers;

import com.tfe.detcorp.entities.Article;
import com.tfe.detcorp.repositories.ArticleRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path="/article")
public class ArticleController {
    @Autowired
    private ArticleRepository articleRepository;

    @PostMapping(path="/addArticle") // Map ONLY POST Requests
    public @ResponseBody Article addNewArticle (@RequestBody Article article) {
        return articleRepository.save(article);
    }

    @GetMapping(path="/allArticle")
    public @ResponseBody Iterable<Article> getAllArticle() {
        return articleRepository.findAll();
    }

    @DeleteMapping("/deleteArticle/{id}")
    @Transactional
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteArticle(@PathVariable Integer id){
        articleRepository.deleteByIdArticle(id);
    }

    @PostMapping(value="/updateArticle/{id}")
    public @ResponseBody Article updateArticle(@RequestParam String newName,@RequestParam double newPoids,@RequestParam double newVolume,@PathVariable Integer id){
        Article article;
        article = articleRepository.findByIdArticle(id);
        article.setNomArticle(newName);
        article.setPoids(newPoids);
        article.setVolume(newVolume);

        return articleRepository.save(article);
    }
    /*@GetMapping(value="/listArticleByCommande")
    public @ResponseBody List<Article> listArticleByCommande(@RequestParam Integer idCommande){
        List<Article> listeArticle;
        listeArticle = articleRepository.findByCommandes_idCommande(idCommande);
        System.out.println(listeArticle.size());
        return listeArticle;
    }*/
}
