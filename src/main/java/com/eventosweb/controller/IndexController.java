package com.eventosweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/eventos/index")
    public String showIndex() {
        return "index";
    }
}
