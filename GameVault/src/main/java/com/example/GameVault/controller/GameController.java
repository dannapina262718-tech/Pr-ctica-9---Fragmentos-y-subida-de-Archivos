package com.example.GameVault.controller;
import org.springframework.stareotype.

@Controller

import java.util.ArrayList;
import java.util.List;

public class GameController {

    private static List<Juegos> juegosBD=new ArrayList<>();

    private static long intCounter = 1;

    private static final String UPLOAD_DIV="src/mainresources/static";

    @GetMapping("/fragmets-demo")
    public String fragments(){
        return "fragmets-demo";
    }

    @GetMapping({"/","/juegos"})
    public String juegos(){
        return "juegos";
    }
    @GetMapping("/juego/nuevo")
    public String mostrarFormulario(){
        return "fromulario";
    }
}
