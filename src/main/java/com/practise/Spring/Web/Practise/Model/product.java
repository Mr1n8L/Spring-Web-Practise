package com.practise.Spring.Web.Practise.Model;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class product {

    private int product_id;
    private String product_name;
    private int product_price;


}
