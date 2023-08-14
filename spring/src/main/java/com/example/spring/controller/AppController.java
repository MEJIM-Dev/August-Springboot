package com.example.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {

    @GetMapping(value = "/")
    public String getHomepage(){
        return "Welcome to homepage";
    }

    @RequestMapping(value = "/electronics", method = RequestMethod.GET)
    public String normalHomepage(
            @RequestParam(name = "q",required = false) String q
//            @RequestParam(name = "age") int gfwydtqfgwas
            )
    {
        System.out.println(q);
//        System.out.println(gfwydtqfgwas);
        return "Without specific Method to homepage";
    }
}
