package com.generation.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.demo.models.SalonModel;
import com.generation.demo.repositories.SalonRepository;


@Service  //decir que esta clase es un servicio ///queremos usar los metodos de el reposity pero son que sea dependiente, si lo implemetno me pedira usar todos los metodos de jpa y hara grande mi codigo
public class SalonService {
	
	private final SalonRepository salonRepository; //creamos un atributo del tipo salonrepository llamado salonrepository, que lo agregaremos al constructor
	                                               //en java podemos crear atributos de tipo objeto, java nos permite ponerle el nombre de donde proviene para poder identificarlo mejor, estamos creando un objeto de esa instancia
	
	                    //autowired es para la inyeccion de dependencias, esto nos permite poder usar los metodos de jpaRepository
	public SalonService(@Autowired SalonRepository salonRepository) {
			this.salonRepository = salonRepository;
	}
	
	
	//obtener y mostrar elementos: quiero obtener los datos de SalonModel en un array list y que me los muestres en un array list. regresandome todos los objetos
	//con esto tiene contacto con la entidad
	public ArrayList<SalonModel> obtenerDatos(){
		return (ArrayList<SalonModel>) salonRepository.findAll();
	}
	
	//Guardar datos: va a guardar el dato y lo regresa mostrandolo
	//aqui no guarda, solo le enviara los datos al repositorio
	//guarda un dato del tipo SalonModel
	//save es para guardar una entidad que especifiquemos, no puedeusarse con el contenido vacio=null
	public SalonModel guardarDatos(SalonModel salonModel) {
		
		return salonRepository.save(salonModel);
	}
	
	
	
	//eliminar datos
	//eliminamos señalando el id
	//boolena solo quiero que diga verdadero o falso
	//try catch como un if e if else: si lo borra sale true, si no la exepecion llamda error manda un false
	public boolean eliminarDato(Integer id) {
		
		try {
			salonRepository.deleteById(id);
			return true;
		}catch (Exception error) {
			return false;
		}
		
		
	}
	
}
