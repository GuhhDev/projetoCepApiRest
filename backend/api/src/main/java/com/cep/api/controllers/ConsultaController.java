package com.cep.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cep.api.model.Consulta;
import com.cep.api.services.ConsultaService;

@RestController
@RequestMapping(value = "/cep")
public class ConsultaController {

	@Autowired
	ConsultaService consultaService;

//	@GetMapping
//	public Consulta verificarCep() {
//
//		return consultaService.buscarCep();
//
//	}
	
	@GetMapping(value = "/{cep}")
	public Consulta buscaCep(@PathVariable String cep) {
		return consultaService.buscarCep(cep);
	}
}
