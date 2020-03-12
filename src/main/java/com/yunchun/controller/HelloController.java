package com.yunchun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller("com.yunchun.controller.HelloController")
public class HelloController {

    @GetMapping("/hello")
    //@RequestMapping (value = "/hello", method = {RequestMethod.GET,RequestMethod.POST})
    public String hello(Model model,@RequestParam("name") String name) {
        //System.out.println(name);
        model.addAttribute("name",name);
        return "Hello";
    }
}
