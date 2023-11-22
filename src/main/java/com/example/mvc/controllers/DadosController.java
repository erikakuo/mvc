package com.example.mvc.controllers;


import com.example.mvc.models.Comidas;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController //retorna dados e não view html; view = front end
@RequestMapping("/api/comidas")
    public class DadosController {
        private static final List<Comidas>
                comidas = new ArrayList<Comidas>();

        public DadosController() {
            comidas.add(new Comidas("Coxinha","Brasil"));
            comidas.add(new Comidas("Burrito","Mexico"));
            comidas.add(new Comidas("Hamburguer","EUA"));
    }

    @GetMapping
    public List<Comidas> getComidas () {
            return comidas;
    }
}
