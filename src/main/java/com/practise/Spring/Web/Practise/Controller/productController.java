package com.practise.Spring.Web.Practise.Controller;

import com.practise.Spring.Web.Practise.Model.product;
import com.practise.Spring.Web.Practise.Service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class productController {

    @Autowired
    productService service;

    @RequestMapping("/products")
    public List<product> getProducts() {
        // Implementation for fetching products from a database
        return service.getProducts();
    }
}
