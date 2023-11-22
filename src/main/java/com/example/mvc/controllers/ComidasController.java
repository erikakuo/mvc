package com.example.mvc.controllers;

import com.example.mvc.models.Comidas;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/comidas")

public class ComidasController {
    private static final List<Comidas>
            comidas = new ArrayList<Comidas>();

    public ComidasController() {
        comidas.add(new Comidas("Pizza","Itália"));
        comidas.add(new Comidas("Sushi","Japão"));
        comidas.add(new Comidas("Strognoff","Rússia"));
    }

    @GetMapping
    public String getComidas(Model model){
        model.addAttribute("comidas",comidas);
        return "comidas";
    }

}
