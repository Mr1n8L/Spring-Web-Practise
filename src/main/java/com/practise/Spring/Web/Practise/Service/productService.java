package com.practise.Spring.Web.Practise.Service;

import com.practise.Spring.Web.Practise.Model.product;
import com.practise.Spring.Web.Practise.Repository.productRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

@Getter
@Service
public class productService {

    @Autowired
    public productRepository repo;

//    List<product> products = new ArrayList<>(Arrays.asList(
//            new product(101, "mobile", 50000),
//            new product(102, "laptop", 70000),
//            new product(103, "headphones", 10000)
//    ));

     //This method is not efficient for large lists as it iterates through the list for each search so instead we use the @Getter method
    public List<product> getProducts() {
        return repo.findAll();
    }

    public product getProductById(int id) {
        // with JPA we only need a return method
        return repo.findById(id).orElse(null);

        // We could also use Java 8 Stream API approach for efficient search for products with a specific id in the list
        // return products.stream().filter(p -> p.getProduct_id() == id).findFirst().orElse(null);

        // or we can use a custom for loop instead
//        for (product product : products) {
//            if (product.getProduct_id() == id) {
//                return product;
//            }
//        }
//        return null;
        }

    public product addProduct(product product){
        // with JPA
        return repo.save(product);

//        products.add(product);
//        return product;
    }

    public product updateProduct(product product){
        // with JPA
        return repo.save(product);

//        products.removeIf(p -> p.getProduct_id() == product.getProduct_id());
//        for(product product1 : products){
//            if(product1.getProduct_id() == product.getProduct_id()){
//                product1.setProduct_name(product.getProduct_name());
//                product1.setProduct_price(product.getProduct_price());
//                return product;
//            }
//        }
//        return null;
    }

    public void deleteProduct(int id){
        // with JPA (also changing return type to void from product)
        repo.deleteById(id);

//        products.removeIf(p -> p.getProduct_id() == id);
//        for(product product : products){
//            if(product.getProduct_id() == id){
//                products.remove(product);
//                return product;
//            }
//        }
//        return null;
    }
}
