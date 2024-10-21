package com.practise.Spring.Web.Practise.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class product {

    @Id
    private int product_id;
    private String product_name;
    private int product_price;


}