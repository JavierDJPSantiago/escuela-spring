package com.generation.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.demo.models.SalonModel;
import com.generation.demo.services.SalonService;

@RestController  //Es ahora un controlador, nos da acceso a otras anotaciones, como cuerpo a las peticiones
public class EscuelaController {
	private final SalonService salonService;
	
	//constructor
	public EscuelaController(@Autowired SalonService salonService) {
		this.salonService = salonService;
		
	}
	
	//mostrar datos de salón
	@GetMapping("/salon")
public ArrayList<SalonModel> obtenerDato(){
	return salonService.obtenerDatos();
}
	
	
	
	//Guardar datos de la tabla salon
	//RequestBody de una peticion http nos permite agrega un tipo de dato
	@PostMapping("/salon")
	public SalonModel guardarDatos(@RequestBody SalonModel salonModel) {
		return salonService.guardarDatos(salonModel);
	}
	
	
	//eliminarDato
	//deleetmapping es para eliminar señalando la ruta : selecciona delet en postman
	//utiliza un dato para identificar el elemento que eliminara
	//@PathVariable() nos ayuda  asignar o identificar al compilador,el Integer id toma la posicion de variable que es la que toma el Deletemapping
	@DeleteMapping(path = "salon/{id}")                      //localhost:8080/salon/1  //1 por que señalamos al 1
	public boolean eliminarDato(@PathVariable("id")Integer id) {
		return salonService.eliminarDato(id);
	}
	
	
}
