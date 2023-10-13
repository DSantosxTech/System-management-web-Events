package com.eventosweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    // Mapeia a URL "/index" para exibir a página "index"
    @GetMapping("/index")
    public String showIndex() {
        return "index";
    }
}
