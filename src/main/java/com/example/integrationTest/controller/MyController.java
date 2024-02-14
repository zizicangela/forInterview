package com.example.integrationTest.controller;

import com.example.integrationTest.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MyController {

    @Autowired
    ProductService productService;

    @GetMapping("/getProduct")
    public ResponseEntity<String> getProduct(){
         System.out.println("Angela");
         return ResponseEntity.status(HttpStatus.OK).body("Angela");
    }


    @PostMapping("/createProduct")
    public ResponseEntity<String> createProduct(){
        productService.createProduct();
        return ResponseEntity.status(HttpStatus.CREATED).body("Proizvod je kreiran uspjesno");
    }


}
