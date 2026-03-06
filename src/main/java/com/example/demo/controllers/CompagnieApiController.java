package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.CompagnieAerienne;
import com.example.demo.models.AvionsLigne;
import com.example.demo.models.FlottesPassagers;
import com.example.demo.repositories.CompagnieAerienneRepository;
import com.example.demo.repositories.AvionsLigneRepository;
import com.example.demo.repositories.FlottesPassagersRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/compagnies")
public class CompagnieApiController {

    @Autowired
    private CompagnieAerienneRepository compagnieRepository;

    @Autowired
    private FlottesPassagersRepository flottesRepository;

    @Autowired
    private AvionsLigneRepository avionsRepository;

    // GET /api/compagnies/ = Liste toutes les compagnies (id et nom uniquement)
    @GetMapping({"", "/"})
    public List<CompagnieAerienne> getCompagnies() {
        return compagnieRepository.findAll();
    }

    // GET /api/compagnies/{idCompagnie} = Détails d'une compagnie avec flottes
    @GetMapping("/{idCompagnie}")
    public Map<String, Object> getCompagnieDetail(@PathVariable String idCompagnie) {
        CompagnieAerienne compagnie = compagnieRepository.findById(idCompagnie)
            .orElseThrow(() -> new RuntimeException("Compagnie non trouvée"));

        List<FlottesPassagers> flottes = flottesRepository.findByIdCompagnie(idCompagnie);

        // Construire la réponse avec les flottes et les avions
        List<Map<String, Object>> flotteDetails = flottes.stream()
            .map(flotte -> {
                Map<String, Object> flotteMap = new HashMap<>();
                flotteMap.put("idFlotte", flotte.getIdFPass());
                flotteMap.put("nombre", flotte.getNombre());
                
                AvionsLigne avion = avionsRepository.findById(flotte.getIdAl()).orElse(null);
                flotteMap.put("avion", avion);
                
                return flotteMap;
            })
            .collect(Collectors.toList());

        Map<String, Object> response = new HashMap<>();
        response.put("id", compagnie.getId());
        response.put("nom", compagnie.getNom());
        response.put("flottes", flotteDetails);

        return response;
    }
}
