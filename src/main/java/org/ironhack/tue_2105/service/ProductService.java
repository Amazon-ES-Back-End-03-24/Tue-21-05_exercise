package org.ironhack.tue_2105.service;

import org.ironhack.tue_2105.model.Product;
import org.ironhack.tue_2105.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product createProduct (Product productRequest){
        Product newProduct = new Product();
        newProduct.setName(productRequest.getName());
        newProduct.setPrice(productRequest.getPrice());
        return productRepository.save(newProduct);
    }
}
