package com.example.familia;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class FamiliaController {
    
    @GetMapping("/familia")
    public String mostrarFamilia(Model model){
        String padre = "Yeraldo Rivera";
        String madre = "Yazmin Avila";
        List<String> hijos = Arrays.asList("Leonel Avila", "Yeraldo Avila");

        model.addAttribute("padre", padre);
        model.addAttribute("madre", madre);
        model.addAttribute("hijos", hijos);
        
        return "familia";
    }
}
