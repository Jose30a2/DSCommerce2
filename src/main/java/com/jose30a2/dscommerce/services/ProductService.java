package com.jose30a2.dscommerce.services;

import com.jose30a2.dscommerce.dto.ProductDTO;
import com.jose30a2.dscommerce.entities.Product;
import com.jose30a2.dscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    //  @Transactional de Spring
    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Optional<Product> result = repository.findById(id);
        Product product = result.get();
        ProductDTO dto = new ProductDTO(product);
        return dto;
    }
}
