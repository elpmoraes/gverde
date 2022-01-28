package com.gverde.gverde.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_products")
public class Product {
    private @Id @GeneratedValue Long id;
    private String name;
    private Integer quantity;
    private Float price;
    private String code;

    public Product(){
        
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public Long getId() {
        return id;
    }public void setId(Long id) {
        this.id = id;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Float getPrice() {
        return price;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
}
