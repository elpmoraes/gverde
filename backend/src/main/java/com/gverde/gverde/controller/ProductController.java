package com.gverde.gverde.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gverde.gverde.dto.ProductDTO;
import com.gverde.gverde.entities.Product;
import com.gverde.gverde.repositories.ProductRepository;
import com.gverde.gverde.services.ProductService;


@RestController
@RequestMapping(value = "/products")
public class ProductController {

    private final ProductRepository repository;

    @Autowired
    private ProductService service;

    ProductController(ProductRepository repository) {
      this.repository = repository;
    }

    @GetMapping("/listAll")
    public List<?> findAll() {
      return service.findAll();
    }
    // ?size=20&page=0
    @GetMapping("/all")
    public Page<ProductDTO> findAll(Pageable pageable) {
      return service.findAll(pageable);
    }

    @GetMapping("/{id}")
    public ProductDTO findById(@PathVariable Long id) {
      return service.findById(id);
    }

    @PostMapping("/add")
    ProductDTO newProduct(@RequestBody ProductDTO newProduct){
        return service.save(newProduct);
    }


    @PutMapping("/{id}")
    Product replaceProduct(@RequestBody Product newProduct, @PathVariable Long id) {
      
      return repository.findById(id)
        .map(product -> {
            product.setName(newProduct.getName());
            product.setPrice(newProduct.getPrice());
          return repository.save(product);
        })
        .orElseGet(() -> {
            newProduct.setId(id);
          return repository.save(newProduct);
        });
    }
  
    @DeleteMapping("/{id}")
    void deleteProduct(@PathVariable Long id) {
      repository.deleteById(id);
    }

}
