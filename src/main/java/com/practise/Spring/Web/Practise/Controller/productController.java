package com.practise.Spring.Web.Practise.Controller;

import com.practise.Spring.Web.Practise.Model.product;
import com.practise.Spring.Web.Practise.Service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class productController {

    @Autowired
    productService service;

    @GetMapping("/products")
    public List<product> getProducts() {
        // Implementation for fetching products from a database
        return service.getProducts();
    }

    @GetMapping("/products/{id}")
    public product getProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @PostMapping("/products")
    // we use @RequestBody to register and receive a response from client side to the server side
    public product addProduct(@RequestBody product product){
        return service.addProduct(product);
    }


    @PutMapping("/products")
    public product updateProduct(@RequestBody product product){
        return service.updateProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public product deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }
}
