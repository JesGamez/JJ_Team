/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HolaMundo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Jesus
 */
@Controller
@Slf4j
public class ControladorInicio {

    @Value("${index.saludo}")
    private String saludo;
    
    @GetMapping("/")
    public String inicio(Model model) {
        var mensaje = "Adios con thymeleaf";
        log.info("Ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje",mensaje);
        model.addAttribute("saludo",saludo);
        return "index";
    }
    
}
