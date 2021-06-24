/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.restC;

import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Jesus
 */

@RestController
@CrossOrigin("*")
@RequestMapping("/restC")
public class restC {

    @GetMapping("/nombre")
    public String nombreSitio() {
        return "para consumir angular :D";
    }
    
    @GetMapping("/descripcion")
    public String descripcionSitio() {
        return "spring + angular";
    }
}
