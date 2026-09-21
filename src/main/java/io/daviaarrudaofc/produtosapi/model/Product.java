package io.daviaarrudaofc.produtosapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

//POJO -> Plain old Java Object

@Setter
@Getter
@Entity
@Table(name = "produto")
public class Product {

    @Id
    @Column(name = "id")
    private String id;// nunca se passa o id,vms dizer assim,pois ela é autoincrementada

    @Column(name = "name")
    private String name;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "preco")
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
