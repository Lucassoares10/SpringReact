package com.devsuperior.dsvendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.service.SaleService;

@RestController         //pra indicar que esta classe vai ser um controlador rest
@RequestMapping(value= "/sales")        // indicar o caminho do recurso web
public class SaleController {

	@Autowired
	private SaleService service;
	
	//endPoint
	
	@GetMapping   //mapeamento
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
		Page<SaleDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);    //indica resp 200 sucesso no http
	}
}
