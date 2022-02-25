package com.generation.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.demo.models.SalonModel;

@Repository  //decir que es un repositorio            //JpaRepository es una clase que viene en el framework, pide el nombre de la tabla que usaremos (la de SalonModel) y el tipo de valor que maneja (Interger)
public interface SalonRepository extends JpaRepository<SalonModel, Integer>{

}
