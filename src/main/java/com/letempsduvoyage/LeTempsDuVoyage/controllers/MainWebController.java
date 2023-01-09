package com.letempsduvoyage.LeTempsDuVoyage.controllers;

import com.letempsduvoyage.LeTempsDuVoyage.beans.Villes;
import com.letempsduvoyage.LeTempsDuVoyage.repositories.VillesRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/API")
public class MainWebController {

    @Autowired
    private VillesRepositoryInterface villesRepositoryInterface;

    @GetMapping("/ajoutVilleEnBase")
    public String ajoutVilleEnBase() {

        Villes ville1 = new Villes("Kenya");
        Villes ville2 = new Villes("Copacabana");
        Villes ville3 = new Villes("Dubaï");
        Villes ville4 = new Villes("Istrie");

        villesRepositoryInterface.save(ville1);
        villesRepositoryInterface.save(ville2);
        villesRepositoryInterface.save(ville3);
        villesRepositoryInterface.save(ville4);

        return ("OK");
    }

    @GetMapping("/getAllVilles")
    public List<Villes> getAllVille() {
        List<Villes> villes = villesRepositoryInterface.findAll();
        return villes;
    }
}
