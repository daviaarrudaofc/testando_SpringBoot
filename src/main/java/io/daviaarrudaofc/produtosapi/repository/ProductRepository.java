package io.daviaarrudaofc.produtosapi.repository;

import io.daviaarrudaofc.produtosapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String>{

}
