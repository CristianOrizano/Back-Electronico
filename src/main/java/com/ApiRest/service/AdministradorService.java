package com.ApiRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiRest.entity.Administrador;
import com.ApiRest.repository.AdministradorRepository;



@Service
public class AdministradorService {
	
	@Autowired
	private AdministradorRepository repo;
	
	//los metodos del crud
	//insert and update
	public Administrador guardar(Administrador ad) {
		return repo.save(ad);
	}
	
	/*metodo eliminar
	public void eliminar(Integer cod) {
		repo.deleteById(cod);
	} */
	
	//metodo eliminar por estado
	public void eliminar(int esta, int codigo) {
		
	   repo.eliminarAdmi(esta,codigo);
		
	} 
	
	//listar
	public List<Administrador> listAdmini(){
		return repo.findAll();
	}
	
	//listado especial para estado activos
	public List<Administrador> listadoActivos(int estado){
		return repo.listadoActivo(estado);
	}
	
	//Metodo buscar para update
	public Administrador BuscarAdmin(Integer cod){
		return repo.findById(cod).orElse(null);
	}
	
	
	

}
