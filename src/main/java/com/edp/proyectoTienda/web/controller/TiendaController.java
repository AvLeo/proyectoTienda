package com.edp.proyectoTienda.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inicio")
public class TiendaController {

    @GetMapping("/holamundo")
    public String holaMundo(){
        return "<h1>Hola Mundo</h1>";
    }

    @GetMapping("")
    public String getInit(){
        return "<h3>Inicio</h3>";
    }

}