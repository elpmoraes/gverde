package com.gverde.gverde.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.gverde.gverde.model.Product;
import com.gverde.gverde.model.ProductsRepository;



@RestController
public class ProductController {

    private final ProductsRepository repository;

    ProductController(ProductsRepository repository) {
      this.repository = repository;
    }


    @GetMapping("/products/all")
    List<Product> all() {
      return repository.findAll();
    }

    @PostMapping("/products/add")
    Product newProduct(@RequestBody Product newProduct){
        return repository.save(newProduct);
    }

    @GetMapping("/products/view/{id}")
    Product view(@PathVariable Long id){
        return repository.findById(id).get();
        // .orElseThrow(() -> new IllegalMonitorStateException());
    }
    @PutMapping("/products/{id}")
    Product replaceProduct(@RequestBody Product newProduct, @PathVariable Long id) {
      
      return repository.findById(id)
        .map(product -> {
            product.setDescricao(newProduct.getDescricao());
            product.setValor(newProduct.getValor());
          return repository.save(product);
        })
        .orElseGet(() -> {
            newProduct.setId(id);
          return repository.save(newProduct);
        });
    }
  
    @DeleteMapping("/products/{id}")
    void deleteProduct(@PathVariable Long id) {
      repository.deleteById(id);
    }

}
