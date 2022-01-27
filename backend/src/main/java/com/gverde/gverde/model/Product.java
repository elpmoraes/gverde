package com.gverde.gverde.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;




@Entity
public class Product {
    private @Id @GeneratedValue long id;
    private int codigo;
    private String descricao;
    private int quantidade;
    private float valor;

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
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
}
