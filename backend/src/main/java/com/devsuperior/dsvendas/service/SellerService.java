package com.devsuperior.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.repositories.SellerRepository;

@Service
//falar que é um componente
public class SellerService {
	
	@Autowired // instancia feita automaticamente pelo frameWork
	private SellerRepository repository;
	
	public List<SellerDTO> findAll(){
	List<Seller> result= repository.findAll();
	
	//pegar todo x da lista e converter ele pra dto chamando o construtor
	return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	//conversao de coleçao para outra, collectors conversa stream para lista
	
	}

}
