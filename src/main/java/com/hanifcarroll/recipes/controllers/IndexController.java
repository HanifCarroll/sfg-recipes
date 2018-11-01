package com.hanifcarroll.recipes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"", "/", "/index", "/index.html"})
    public String getIndexPage() {
        System.out.println("Test!!");
        return "index";
    }
}
