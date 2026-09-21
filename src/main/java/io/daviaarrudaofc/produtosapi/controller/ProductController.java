package io.daviaarrudaofc.produtosapi.controller;

import io.daviaarrudaofc.produtosapi.model.Product;
import io.daviaarrudaofc.produtosapi.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController// QUE VAI RECEBER RECEBER REQUISIÇOIES,POR ISSO MARCA A CLASSE co, esse anotation
@RequestMapping("/produtos")// é pra dizer a URL base desse controller
public class ProductController {

    private final ProductRepository  productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public Product salvar(@RequestBody Product produto){
        System.out.println("Produto recebido : "+ produto);
        // Gera um ID único para o produto e define esse ID no objeto
        var id = UUID.randomUUID().toString();
        produto.setId(id);
        productRepository.save(produto);
        return produto;
    }
    @GetMapping("/{id}")
    public Product obterPorId(@PathVariable("id") String id){
       // Optional<Product> produto = productRepository.findById(id);
       // return produto.isPresent() ? produto.get() : null;
        return  productRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") String  id){
        productRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable("id") String id, @RequestBody Product produto){
        produto.setId(id);
        productRepository.save(produto);
    }
    @GetMapping
    public List<Product> buscar(@RequestParam("name") String name){
        return productRepository.findByName(name);
    }
}
