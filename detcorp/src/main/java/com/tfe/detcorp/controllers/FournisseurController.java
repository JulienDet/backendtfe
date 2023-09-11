package com.tfe.detcorp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo")
public class FournisseurController {
  /*  @Autowired
    private FournisseurRepository fournisseurRepository;

    @PostMapping(path="/addFournisseur") // Map ONLY POST Requests
    public @ResponseBody String addNewFournisseur (@RequestParam String nom_Fournisseur) {

       Fournisseur n = new Fournisseur();
        n.setNom_Fournisseur(nom_Fournisseur);
        fournisseurRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/allFournisseur")
    public @ResponseBody Iterable<Fournisseur> getAllFournisseurs() {
        return fournisseurRepository.findAll();
    }*/
}
