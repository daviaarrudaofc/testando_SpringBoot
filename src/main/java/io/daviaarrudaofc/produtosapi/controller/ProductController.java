package io.daviaarrudaofc.produtosapi.controller;

import io.daviaarrudaofc.produtosapi.model.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController// QUE VAI RECEBER RECEBER REQUISIÇOIES,POR ISSO MARCA A CLASSE co, esse anotation
@RequestMapping("/produtos")// é pra dizer a URL base desse controller
public class ProductController {

    @PostMapping
    public Product salvar(@RequestBody Product produto){
        System.out.println("Produto recebido : "+ produto);
        return produto;
    }

}
