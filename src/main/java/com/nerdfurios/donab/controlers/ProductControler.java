package com.nerdfurios.donab.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nerdfurios.donab.dto.ProductMinDTO;
import com.nerdfurios.donab.services.ProductServise;

@RestController
@RequestMapping(value = "/products")
public class ProductControler {
	
	@Autowired
	private ProductServise productServise;
	
	public List<ProductMinDTO> findAll(){
		List<ProductMinDTO> result = productServise.findAll();
		return result;
	}
	
}
