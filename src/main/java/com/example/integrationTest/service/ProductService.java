package com.example.integrationTest.service;

import com.example.integrationTest.entity.Element;
import com.example.integrationTest.entity.Product;
import com.example.integrationTest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void createProduct(){

        Product product = new Product();

        product.elements = new ArrayList<>();

        Element element = new Element();

        product.elements.add(element);

        productRepository.save(product);

    }

}
