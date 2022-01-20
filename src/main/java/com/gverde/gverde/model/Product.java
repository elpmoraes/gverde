package com.gverde.gverde.model;

public class Product {
    private long id;
    private int codigo;
    private String descricao;
    private int quantidade;
    private float valor;
    private String codigo_barras;

    public Product(){
        
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public long getId() {
        return id;
    }public void setId(long id) {
        this.id = id;
    }
}
