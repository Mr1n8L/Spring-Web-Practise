package com.practise.Spring.Web.Practise.Service;

import com.practise.Spring.Web.Practise.Model.product;
import lombok.Getter;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class productService {


    List<product> products = new ArrayList<>(Arrays.asList(
            new product(101, "mobile", 50000),
            new product(102, "laptop", 70000),
            new product(103, "headphones", 10000)
    ));

    public List<product> getProducts() {
        return products;
    }

    public product getProductById(int id) {

        // We could also use Java 8 Stream API approach for efficient search for products with a specific id in the list
        // return products.stream().filter(p -> p.getProduct_id() == id).findFirst().orElse(null);

        // or we can use a custom for loop instead
        for (product product : products) {
            if (product.getProduct_id() == id) {
                return product;
            }
        }
        return null;
    }

    public product addProduct(product product){
        products.add(product);
        return product;
    }

    public product updateProduct(product product){
        for(product product1 : products){
            if(product1.getProduct_id() == product.getProduct_id()){
                product1.setProduct_name(product.getProduct_name());
                product1.setProduct_price(product.getProduct_price());
                return product;
            }
        }
        return null;
    }

    public product deleteProduct(int id){
        for(product product : products){
            if(product.getProduct_id() == id){
                products.remove(product);
                return product;
            }
        }
        return null;
    }
}
