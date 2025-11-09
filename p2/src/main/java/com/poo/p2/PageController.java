package com.poo.p2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    //mapeia a url (http://localhost:8080/)
    @GetMapping("/")
    public String getLandingPage() {
        //procura o arquivo "index.html" na pasta "templates"
        return "index";
    }
}