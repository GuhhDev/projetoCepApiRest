package com.cep.api.services;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cep.api.model.Consulta;

@Service
public class ConsultaService {

	public Consulta buscarCep(String cep) {
		
		RestTemplate restTemplate = new RestTemplate();
		RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
		restTemplate = restTemplateBuilder.build();
		
		Consulta consulta = restTemplate.getForObject( "https://viacep.com.br/ws/"+ cep + "/json/" , Consulta.class);
		
		return consulta;
	}
}
