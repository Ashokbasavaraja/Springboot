package com.example.ecommerce.Controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Productlist.api.ProductDto;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ProductRestController {

    private  CustomerService customerService;
    
    

    @GetMapping("/products")
    public List<ProductDto> getAllProducts() {
        return CustomerService.getAllProducts();
    }
}
