package com.practise.Spring.Web.Practise.Service;

import com.practise.Spring.Web.Practise.Model.product;
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
}
