package com.example.ecommerce.Controller;

import java.util.List;

import Productlist.api.ProductDto;

public interface ProductRepository {
	List<ProductDto> FindAll();

}
