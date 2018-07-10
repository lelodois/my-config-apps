package br.com.lelo.springcloud.myproduct.controller;

import br.com.lelo.springcloud.mydash.model.Product;
import br.com.lelo.springcloud.mydash.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("all")
    public ResponseEntity<List<Product>> message() {
        return ResponseEntity.ok(service.getList());
    }
}