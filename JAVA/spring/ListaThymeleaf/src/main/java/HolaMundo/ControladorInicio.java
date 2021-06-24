/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HolaMundo;

import java.util.ArrayList;
import java.util.Arrays;
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
        
        var persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEmail("Perez@gmail.com");
        persona.setTelefono("123456789");
        
        var persona2 = new Persona();
        persona2.setNombre("Angie");
        persona2.setApellido("Nayeli");
        persona2.setEmail("Angie@gmail.com");
        persona2.setTelefono("123456789");
        
//        var personas = new ArrayList();
//        personas.add(persona);
//        personas.add(persona);
        
        var personas = Arrays.asList(persona,persona2);
//        var personas = new ArrayList();
        
        log.info("Ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje",mensaje);
        model.addAttribute("saludo",saludo);
//        model.addAttribute("persona",persona);
        model.addAttribute("personas",personas);
        return "index";
    }
    
}
