package com.eventosweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventoController {
    @GetMapping("/eventos/cadastroevento")
    public String showEventForm() {
        return "evento/formEvento";
    }
}
