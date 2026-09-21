package io.daviaarrudaofc.produtosapi.repository;

import io.daviaarrudaofc.produtosapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String>{
    List<Product> findByName(String name);
}
