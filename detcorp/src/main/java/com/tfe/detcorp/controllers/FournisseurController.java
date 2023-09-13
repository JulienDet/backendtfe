package com.tfe.detcorp.controllers;

import com.tfe.detcorp.entities.Employe;
import com.tfe.detcorp.entities.Fournisseur;
import com.tfe.detcorp.repositories.FournisseurRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/fournisseur")
public class FournisseurController {
  @Autowired
    private FournisseurRepository fournisseurRepository;

    @PostMapping(path="/addFournisseur") // Map ONLY POST Requests
    public @ResponseBody Fournisseur addNewFournisseur (@RequestBody Fournisseur fournisseur) {
        return fournisseurRepository.save(fournisseur);
    }

  @PostMapping(value="/updateFournisseur/{id}")
  public @ResponseBody Fournisseur updateFournisseur(@RequestParam String newName, @PathVariable Integer id){
    Fournisseur fournisseur;
    fournisseur = fournisseurRepository.findByIdFournisseur(id);
    fournisseur.setNomFournisseur(newName);
    return fournisseurRepository.save(fournisseur);
  }

    @GetMapping(path="/allFournisseur")
    public @ResponseBody Iterable<Fournisseur> getAllFournisseurs() {
        return fournisseurRepository.findAll();
    }

    @DeleteMapping("/deleteFournisseur/{id}")
    @Transactional
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteFournisseur(@PathVariable Integer id){
        fournisseurRepository.deleteByIdFournisseur(id);
    }
}
