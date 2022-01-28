package com.gverde.gverde.services;

import java.util.ArrayList;
import java.util.List;

import com.gverde.gverde.dto.ProductDTO;
import com.gverde.gverde.entities.Product;
import com.gverde.gverde.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<?> findAll(){
        List<Product> result = repository.findAll();
        List<?> dto = result;
       
        return dto;
    }

    @Transactional(readOnly = true)
    public Page<ProductDTO> findAll(Pageable pageable){
        Page<Product> result = repository.findAll(pageable);

        Page<ProductDTO> page = result.map(x -> new ProductDTO(x));

        return page;

    }

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id){
        Product result = repository.findById(id).get();
        ProductDTO dto = new ProductDTO(result);
        return dto;
    }

    public ProductDTO save(Product product){
        Product result = repository.save(product);
        return new ProductDTO(result);
  
    }
}
