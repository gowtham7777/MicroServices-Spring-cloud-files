package com.microapp.clientcode;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SayHello {

    @RequestMapping("/hi")
    public @ResponseBody  String sayHi(){
        return "Hi there";
    }
}
