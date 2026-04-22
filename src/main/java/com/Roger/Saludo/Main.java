package com.Roger.Saludo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {

    @GetMapping("/saludo")
    public String saludo() {
        return "Hola Mundo!!!";
    }
}
