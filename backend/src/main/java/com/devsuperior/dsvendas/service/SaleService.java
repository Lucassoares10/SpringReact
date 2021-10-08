package com.devsuperior.dsvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.repositories.SaleRepository;
import com.devsuperior.dsvendas.repositories.SellerRepository;

@Service
//falar que é um componente
public class SaleService {
	
	@Autowired // instancia feita automaticamente pelo frameWork
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository; //antes de buscar a pag, buscar todos vendedores
	
	@Transactional(readOnly=true) // para nao fazer lock no banco
	public Page<SaleDTO> findAll(Pageable pageable){
	//trazer os vendedores para memoria a jpa vai armazenar em cache para quando for buscar as vendas eles ja vao estar em memoria
	
	sellerRepository.findAll();  
	Page<Sale> result= repository.findAll(pageable);
	
	//pegar todo x da lista e converter ele pra dto chamando o construtor
	return result.map(x -> new SaleDTO(x));
	//conversao de coleçao para outra, collectors conversa stream para lista
	
	}

}
