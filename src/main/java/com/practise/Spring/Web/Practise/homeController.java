package com.practise.Spring.Web.Practise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {

    public String greet(){
        return "Hello, World!";
    }
}
