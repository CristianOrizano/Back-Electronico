package com.ApiRest.controller;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

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
@RequestMapping("/restciu")
public class CiudadController {
	
	@Autowired
	private CiudadService serCiu;
	
	
	//metodo para listar ciudad
	@GetMapping()
	public List<Ciudad> Listaciudad(Model model) {
		List<Ciudad> ciu= serCiu.listCiuda();

		return ciu;
	}
	



}
