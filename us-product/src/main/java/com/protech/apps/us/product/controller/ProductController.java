package com.protech.apps.us.product.controller;

import com.protech.apps.us.product.entities.Product;
import com.protech.apps.us.product.service.IProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Classe controlleur
 *
 * @author BLU Kwensy Eli
 */
@RestController
@RequestMapping("/products")
public class ProductController {

    /**
     * Injection d'une instance de IProductService
     */
    @Autowired
    IProductService productService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World from product service!";
    }

    /**
     * Méthode définissant une ressource REST permettant de créer un produit
     *
     * @param product
     * @return
     */
    @PostMapping("/")
    public ResponseEntity<Product> save(@RequestBody Product product) {
        return ResponseEntity.ok(productService.save(product));
    }

    /**
     * Méthode définissant une ressource REST permettant de retrouver un produit
     * grâce à son identifiant
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ResponseEntity<Product> findOne(@PathVariable Long id) {
        return ResponseEntity.ok(productService.findOne(id));
    }

    /**
     * Méthode définissant une ressource REST permettant de modifier un produit
     *
     * @param product
     * @return
     */
    @PutMapping("/")
    public ResponseEntity<Product> update(@RequestBody Product product) {
        return ResponseEntity.ok(productService.update(product));
    }

    /**
     * Méthode définissant une ressource REST permettant de modifier un produit
     *
     * @return La liste des produits
     */
    @GetMapping("/")
    public ResponseEntity<List<Product>> findAll() {
        return ResponseEntity.ok(productService.findAll());
    }

    /**
     * Méthode définissant une ressource REST permettant de supprimer un produit
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Product> delete(@PathVariable Long id) {
        //On retrouve l'entité à partir de son identifiant
        Product product = productService.findOne(id);
        // Suppression de l'entité
        productService.delete(product);
        // Tout se passe bien
        return ResponseEntity.ok(null);
    }

}
