package com.practise.Spring.Web.Practise.Controller;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {

    @RequestMapping("/")
    //alternatively we can use @ResponseBody to return the data from the server to the client like REST does
    public String greet(){
        return "Hello, World!";
    }

    @RequestMapping("/about")
    //Requests a mapped by a "Front Controller" present b/w the client layer and controller(of server) layer
    public String about(){
        return "This is the about page";
    }
}
