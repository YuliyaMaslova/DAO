package com.example.dao.controller;

import com.example.dao.repository.DatabaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final DatabaseRepository databaseRepository;

    public ProductController(DatabaseRepository databaseRepository) {
        this.databaseRepository = databaseRepository;
    }

    @GetMapping("/products/fetch-product")
    public List<String> fetchProduct(@RequestParam("name") String name) {
        return databaseRepository.getProductName(name);
    }
}
