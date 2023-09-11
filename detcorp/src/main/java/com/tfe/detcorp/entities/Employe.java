package com.tfe.detcorp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Employe {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer iD_Employe;
    private String name;
    private String mdp;
    private Integer tag;

}
