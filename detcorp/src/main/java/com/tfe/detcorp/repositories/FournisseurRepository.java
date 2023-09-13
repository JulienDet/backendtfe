package com.tfe.detcorp.repositories;

import com.tfe.detcorp.entities.Fournisseur;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

public interface FournisseurRepository extends CrudRepository<Fournisseur,Integer> {
    @Transactional
    void deleteByIdFournisseur(Integer idFournisseur);

    Fournisseur findByIdFournisseur(Integer id);
}
