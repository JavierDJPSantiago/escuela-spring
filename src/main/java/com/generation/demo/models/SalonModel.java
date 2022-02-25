package com.generation.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//la modificaremos para hacerla un modelo
//se hara un modelo de las tablas/bd que tenemos
//lo haremos, sin tener BD

@Entity   //con esto toma a esta clase como una entidad de base de datos(una tabla)
@Table(name = "salon")  //para darle un nombre especifico a la tabla y que no ocupe el nombre de la clase
public class SalonModel {

	@Id   //esto indica que el primer atributo que pusimos (id) se convertira en el id de mi tabla
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //para darle auto incremento
	@Column(unique = true, nullable = false )   //decirle que este nombre (del id) sera unico y sera NOT NULL
	private Integer id;                        //Todo lo anterior era solo para este atributo//ya lo identifica como llave primaria
	
	@Column(name = "materia", nullable = false,length = 120)    //lenght es el limite de caracteres
	private String materia;
	
	@Column(name = "maestro", nullable = false,length = 120)
	private String maestro;

	
	public SalonModel() {  //constructor: lo pide la documentación
		
	}
	



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getMaestro() {
		return maestro;
	}
	public void setMaestro(String maestro) {
		this.maestro = maestro;
	}
	
	
	@Override
	public String toString() {
		return "SalonModel [id=" + id + ", materia=" + materia + ", maestro=" + maestro + "]";
	}




	
	
	
}
