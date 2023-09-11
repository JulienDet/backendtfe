package com.tfe.detcorp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo")
public class EmplacementController {
 /*   @Autowired
    private EmplacementRepository emplacementRepository;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewEmplacement (@RequestParam double volume_Max, @RequestParam double volume_Actuel) {

        Emplacement n = new Emplacement();
        n.setVolume_max(volume_Max);
        n.setVolume_actuel(volume_Actuel);
        emplacementRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Emplacement> getAllEmplacements() {
        return emplacementRepository.findAll();
    }*/
}
