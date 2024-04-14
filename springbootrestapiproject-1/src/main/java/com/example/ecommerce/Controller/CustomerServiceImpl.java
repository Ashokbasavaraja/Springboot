package com.example.ecommerce.Controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import Productlist.api.ProductDto;
import lombok.RequiredArgsConstructor;

@Service
	@RequiredArgsConstructor
	public class CustomerServiceImpl implements CustomerService {

	    private  ProductRepository productRepository;

	    public List<ProductDto> getAllProducts() {
	        return productRepository.FindAll().stream()
	                .map(product -> new ProductDto(product.getName(), product.getPrice()))
	                .collect(Collectors.toList());
	    }
	}


