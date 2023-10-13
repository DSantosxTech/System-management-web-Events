package com.eventosweb.controller;

import com.eventosweb.model.Evento;
import com.eventosweb.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventoController {
    @Autowired
    private EventoRepository er;

    // Exibe o formulário de cadastro de eventos
    @RequestMapping(value = "/cadastrarEvento", method = RequestMethod.GET)
    public String form() {
        return "evento/formEvento";
    }

    // Processa o formulário de cadastro de eventos e redireciona para a página de cadastro
    @RequestMapping(value = "/cadastrarEvento", method = RequestMethod.POST)
    public String form(Evento evento) {
        er.save(evento);
        return "redirect:/cadastrarEvento";
    }

    // Lista todos os eventos cadastrados
    @RequestMapping("/eventos")
    public ModelAndView listaEventos() {
        ModelAndView mv = new ModelAndView("index");
        Iterable<Evento> eventos = er.findAll();
        mv.addObject("eventos", eventos);
        return mv;
    }
}
