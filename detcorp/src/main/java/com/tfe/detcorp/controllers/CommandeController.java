package com.tfe.detcorp.controllers;

import com.tfe.detcorp.entities.Article;
import com.tfe.detcorp.entities.Commande;
import com.tfe.detcorp.repositories.ArticleRepository;
import com.tfe.detcorp.repositories.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path="/commande")
public class CommandeController {
    @Autowired
    private CommandeRepository commandeRepository;

    @GetMapping(path="/allCommande")
    public @ResponseBody Iterable<Commande> getAllCommande() {
        return commandeRepository.findAll();
    }

    /*@GetMapping(path="/listArticleByCommande")
    public @ResponseBody Commande findCommandeWithArticle(){return commandeRepository.findCommandeWithArticle(1);}*/

  /*  @GetMapping(path="/listeCommande")
    public @ResponseBody Iterable<Commande> findByArticle(){

        List<Commande> listeCommande = commandeRepository.findByArticle();
        return listeCommande;
    }*/

}
