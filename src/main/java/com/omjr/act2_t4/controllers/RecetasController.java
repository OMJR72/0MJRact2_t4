package com.omjr.act2_t4.controllers;

import com.omjr.act2_t4.models.Receta;
import com.omjr.act2_t4.models.dto.RecetaDTO;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping("")
public class RecetasController {
    @Value("${nombre.proyecto}")
    private String nombreProyecto;
    List<RecetaDTO> recetas = new ArrayList<>();

    public void auxiliar(){
        if (recetas.isEmpty()) {
            recetas.add(new RecetaDTO("Pastel de chocolate", "Postres", "30 min"));
            recetas.add(new RecetaDTO("Ensalada de frutas", "Ensaladas", "15 min"));
            recetas.add(new RecetaDTO("Ensalada de verduras", "Ensaladas", "20 min"));
        }
    }
    @GetMapping("")
    public String getRecetas(Model model){
        auxiliar();
        model.addAttribute("recetas", recetas);
        model.addAttribute("proyecto", nombreProyecto);

        return "index";
    }

    @GetMapping("/Agregar")
    public String getAgregar(Model model){
        model.addAttribute("receta", new RecetaDTO());
        return "Agregar";
    }
 
    @GetMapping("/Recetas")
    public String getRec(Model model) {
        model.addAttribute("recetas", recetas);
        return "index";
    }

    @PostMapping("/guardar")
    public String postGuardar(@ModelAttribute RecetaDTO receta) {
        recetas.add(receta);
        return "redirect:/Recetas";
    }
    
    @GetMapping("/filtrar")
    public String filtrar(@RequestParam String categoria, Model model) {

        List<RecetaDTO> filtradas = new ArrayList<>();

        for (RecetaDTO receta : recetas) {
            if (receta.getCategoria().equalsIgnoreCase(categoria)) {
                filtradas.add(receta);
            }
        }

        model.addAttribute("recetas", filtradas);

        return "index";
    }

    @GetMapping("/detalle/{id}")
    public String detalleReceta(@PathVariable int id, Model model) {

        RecetaDTO receta = recetas.get(id);
        
        model.addAttribute("receta", receta);
        return "detalle";
    }

    
}
