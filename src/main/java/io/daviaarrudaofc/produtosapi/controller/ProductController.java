package io.daviaarrudaofc.produtosapi.controller;

import io.daviaarrudaofc.produtosapi.model.Product;
import io.daviaarrudaofc.produtosapi.repository.ProductRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController// QUE VAI RECEBER RECEBER REQUISIÇOIES,POR ISSO MARCA A CLASSE co, esse anotation
@RequestMapping("/produtos")// é pra dizer a URL base desse controller
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public Product salvar(@RequestBody Product produto){
        System.out.println("Produto recebido : "+ produto);
        var id = UUID.randomUUID().toString();
        produto.setId(id);
        productRepository.save(produto);
        return produto;
    }

}
