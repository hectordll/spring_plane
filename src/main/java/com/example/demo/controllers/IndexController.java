package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.models.CompagnieAerienne;
import com.example.demo.models.AvionsLigne;
import com.example.demo.models.FlottesPassagers;
import com.example.demo.repositories.CompagnieAerienneRepository;
import com.example.demo.repositories.AvionsLigneRepository;
import com.example.demo.repositories.FlottesPassagersRepository;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class IndexController {

    @Autowired
    private CompagnieAerienneRepository compagnieRepository;

    @Autowired
    private FlottesPassagersRepository flottesRepository;

    @Autowired
    private AvionsLigneRepository avionsRepository;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/compagnie")
    public String compagnie(Model model) {
        model.addAttribute("compagnie", compagnieRepository.findAll());
        return "planes/compagnie";
    }

    @GetMapping("/compagnie/{idCompagnie}")
    public String compagnieDetail(@PathVariable String idCompagnie, Model model) {
        // Récupérer la compagnie
        CompagnieAerienne compagnie = compagnieRepository.findById(idCompagnie).orElse(null);
        if (compagnie == null) {
            return "redirect:/compagnie";
        }

        // Récupérer les flottes de la compagnie
        List<FlottesPassagers> flottes = flottesRepository.findByIdCompagnie(idCompagnie);

        // Pour chaque flotte récupérer l'avion
        List<FlotteDetail> flotteDetails = flottes.stream().map(flotte -> {
            AvionsLigne avion = avionsRepository.findById(flotte.getIdAl()).orElse(null);
            return new FlotteDetail(flotte, avion);
        }).collect(Collectors.toList());

        model.addAttribute("compagnie", compagnie);
        model.addAttribute("flotteDetails", flotteDetails);
        return "planes/compagnie-detail";
    }

    @GetMapping("/admin/compagnie/ajout")
    public String ajoutCompagnie() {
        return "admin/ajout-compagnie";
    }

    @PostMapping("/admin/compagnie/ajout")
    public String saveCompagnie(@RequestParam String idCompagnie, 
                                @RequestParam String nom,
                                RedirectAttributes redirectAttributes) {
        try {
            CompagnieAerienne compagnie = new CompagnieAerienne();
            compagnie.setId(idCompagnie);
            compagnie.setNom(nom);
            compagnieRepository.save(compagnie);
            
            redirectAttributes.addFlashAttribute("message", "Compagnie aérienne ajoutée avec succès!");
            return "redirect:/compagnie";
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Erreur lors de l'ajout: " + e.getMessage());
            return "redirect:/admin/compagnie/ajout";
        }
    }

    // Classe pour lier flotte et avion
    public static class FlotteDetail {
        public FlottesPassagers flotte;
        public AvionsLigne avion;

        public FlotteDetail(FlottesPassagers flotte, AvionsLigne avion) {
            this.flotte = flotte;
            this.avion = avion;
        }

        public FlottesPassagers getFlotte() {
            return flotte;
        }

        public AvionsLigne getAvion() {
            return avion;
        }
    }

}