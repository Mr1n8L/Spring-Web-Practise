package com.practise.Spring.Web.Practise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {

    @RequestMapping("/")
    //alternatively we can use @ResponseBody to return the data from the server to the client like REST does
    public String greet(){
        return "Hello, World!";
    }


}

