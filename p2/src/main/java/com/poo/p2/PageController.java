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

@GetMapping("/pagina-auxiliar-1")
public String getAuxiliarPage1() {
    return "pagina-auxiliar-1"; // procura /templates/pagina-auxiliar-1.html
}

@GetMapping("/pagina-auxiliar-2")
public String getAuxiliarPage2() {
    return "pagina-auxiliar-2"; // procura /templates/pagina-auxiliar-2.html
}
}