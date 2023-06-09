package com.ApiRest.controller;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ApiRest.entity.Administrador;
import com.ApiRest.entity.Ciudad;
import com.ApiRest.entity.Estado;
import com.ApiRest.service.AdministradorService;
import com.ApiRest.service.CiudadService;

@RestController
@RequestMapping("/restadm")
@CrossOrigin(origins = "https://cyberelectronic.netlify.app")
public class AdministradorController {
	
	@Autowired
	private AdministradorService seradm;
	
	@Autowired
	private CiudadService serCiu;
	
	
	//metodo para listar admin
	@GetMapping()
	public List<Administrador> ListarAdmi(Model model) {
		List<Administrador> lista= seradm.listadoActivos(1);

		return lista;
	}

	
	//metodo para insertar
	@PostMapping()
	public Administrador insertar(@RequestBody Administrador admin,Model model) {

		
		return seradm.guardar(admin);
	}
	
	
	//metodo de buscar para actualizar
	@GetMapping("/{id}")
	public ResponseEntity<Administrador> buscar(@PathVariable("id") int cod) {
		
		Administrador admi= seradm.BuscarAdmin(cod);

		List<Ciudad> lista= serCiu.listCiuda();

		//return admi;
		return ResponseEntity.ok(admi);
	} 
	
	//metodo para Actualizar
	@PutMapping()
	public Administrador actualizar(@RequestBody Administrador admin) {
		
		return seradm.guardar(admin);
	}
	
	//metodo para Eliminar
	@DeleteMapping("/{id}")
	public void Eliminar(@PathVariable("id") int cod) {
		
		seradm.eliminar(0,cod);
	
	}
	
	



}
