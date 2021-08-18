package br.edu.iftm.teste;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class teste {
    
    @RequestMapping("/alo")
    public String master(Model modelo){
        modelo.addAttribute("numero1",Math.round(Math.random()*60));
        modelo.addAttribute("numero2", 100);
        modelo.addAttribute("x", "alo mundo");
        return "view1";
    }
}
