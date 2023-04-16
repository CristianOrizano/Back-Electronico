package com.ApiRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiRest.entity.Ciudad;
import com.ApiRest.repository.CiudadRepository;



@Service
public class CiudadService {
	
	@Autowired
	private CiudadRepository repo;
	
	//listar
	public List<Ciudad> listCiuda(){
		return repo.findAll();
	}
	

}
