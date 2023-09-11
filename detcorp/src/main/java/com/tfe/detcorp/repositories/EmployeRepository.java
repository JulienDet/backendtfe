package com.tfe.detcorp.repositories;
import com.tfe.detcorp.entities.Employe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends CrudRepository<Employe,Integer>{
    Employe findByName(String name);
}

