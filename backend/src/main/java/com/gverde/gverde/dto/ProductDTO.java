package com.gverde.gverde.dto;
import com.gverde.gverde.entities.Product;
   
   public class ProductDTO {
    private Long id;
    private String name;
    private Integer quantity;
    private Float price;
    private String code;

    public ProductDTO(Product product){
        this.id         = product.getId();
        this.name       = product.getName();
        this.quantity   = product.getQuantity();
        this.price      = product.getPrice();
        this.code       = product.getCode();

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