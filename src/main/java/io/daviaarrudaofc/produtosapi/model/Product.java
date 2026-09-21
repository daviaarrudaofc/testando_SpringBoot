package io.daviaarrudaofc.produtosapi.model;

import lombok.Getter;
import lombok.Setter;

//POJO -> Plain old Java Object
@Setter
@Getter
public class Product {
    private String id;// nunca se passa o id,vms dizer assim,pois ela é autoincrementada
    private String name;
    private String descricao;
    private Double preco;


    public Product(){

    }

    public Product(String descricao, String id, String name, Double preco) {
        this.descricao = descricao;
        this.id = id;
        this.name = name;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Product{" +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                "descricao='" + descricao + '\'' +
                ", preco='" + preco + '\'' +
                '}';
    }
}
