package com.tfe.detcorp.controllers;

import com.tfe.detcorp.entities.Employe;
import com.tfe.detcorp.repositories.EmployeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/user")
public class EmployeController {
    @Autowired
    private EmployeRepository employeRepository;

    @PostMapping(value="/addUser", consumes = "application/json", produces = "application/json")
    public @ResponseBody Employe addNewEmploye (@RequestBody Employe employe) {
        return employeRepository.save(employe);
    }

    @PostMapping(value="/updateUser/{name}")
    public @ResponseBody Employe update(@RequestParam String newName, @RequestParam String mdp, @PathVariable String name){
        Employe employe;
        employe = employeRepository.findByName(name);
        employe.setName(newName);
        employe.setMdp(mdp);
        return employeRepository.save(employe);
    }


    @DeleteMapping("/deleteUser/{name}")
    @Transactional
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEmploye(@PathVariable String name){
        employeRepository.deleteByName(name);
    }

    @GetMapping(path="/allUsers")
    public @ResponseBody Iterable<Employe> getAllUsers() {
        // This returns a JSON or XML with the users
        return employeRepository.findAll();
    }

   @PostMapping(path="/login")
    public @ResponseBody Employe getEmploye(@RequestParam String name, @RequestParam String mdp){
        Employe employe;
        employe = employeRepository.findByName(name);
        if(employe!=null){
            if(employe.getMdp().equals(mdp)){
                return employe;
            }
        }
        return null;
    }
}
