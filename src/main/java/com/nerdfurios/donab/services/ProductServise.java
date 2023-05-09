package com.nerdfurios.donab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nerdfurios.donab.dto.ProductMinDTO;
import com.nerdfurios.donab.entities.Product;
import com.nerdfurios.donab.repositories.ProductRepository;

@Service
public class ProductServise {

	@Autowired
	private ProductRepository productRepository;
	
	public List<ProductMinDTO> findAll(){
		List<Product> result = productRepository.findAll();
		List<ProductMinDTO> dto = result.stream().map(x -> new ProductMinDTO(x)).toList();
		return dto;
	}
}
