package com.letempsduvoyage.LeTempsDuVoyage.controllers;

import com.letempsduvoyage.LeTempsDuVoyage.beans.*;
import com.letempsduvoyage.LeTempsDuVoyage.repositories.ContinentsRepositoryInterface;
import com.letempsduvoyage.LeTempsDuVoyage.repositories.RestaurantsRepositoryInterface;
import com.letempsduvoyage.LeTempsDuVoyage.repositories.SitesTouristiquesRepositoryInterface;
import com.letempsduvoyage.LeTempsDuVoyage.repositories.VillesRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/API")
public class MainWebController {

    @Autowired
    private VillesRepositoryInterface villesRepositoryInterface;

    @Autowired
    private ContinentsRepositoryInterface continentsRepositoryInterface;

    @Autowired
    private RestaurantsRepositoryInterface restaurantsRepositoryInterface;

    @Autowired
    SitesTouristiquesRepositoryInterface sitesTouristiquesRepositoryInterface;

    @PostMapping("/recuperationVille")
    public String recuperationVille(@RequestBody Villes ville) {
        System.out.println(ville);
        villesRepositoryInterface.save(ville);
        return "OK";
    }



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

    @GetMapping("/ajoutContinentsEnBase")
    public String ajoutContinentsEnBase() {

        Continents continent1 = new Continents("Afrique");
        Continents continent2 = new Continents("Amérique");
        Continents continent3 = new Continents("Asie");
        Continents continent4 = new Continents("Europe");


        continentsRepositoryInterface.save(continent1);
        continentsRepositoryInterface.save(continent2);
        continentsRepositoryInterface.save(continent3);
        continentsRepositoryInterface.save(continent4);

        return ("OK");
    }

    @GetMapping("/getAllContinents")
    public List<Continents> getAllContinents() {
        List<Continents> continents = continentsRepositoryInterface.findAll();
        return continents;
    }




    //..........Restaurants.........//


    @GetMapping("/ajoutRestaurantsEnBase")
    public String ajoutRestaurantsEnBase() {
        Restaurants resto1 = new Restaurants("NJUGUNA'S PLACE","Locale",8,26,"Waiyaki Way Nairobi ");
        Restaurants resto2 = new Restaurants("Jiko","Africaine",8,26,"Limuru Road Tribe Hotel The Village Market, Gigiri, Nairobi 00621 Kenya");
        Restaurants resto3 = new Restaurants("Restaurant Gourmet ALI","Latino, Végétariens",4,9,"Av. 6 de agosto, Copacabana Bolivie");
        Restaurants resto4 = new Restaurants("Terradentro Lago Titicaca","Internationale",5,15,"Av Costanera corner Rigoberto Paredes, Copacabana Bolivie");
        Restaurants resto5 = new Restaurants("Al Khayma Heritage Restaurant & Cafe","Fruits de mer & Poisson,Méditerranéenne,Barbecue/Grillades",9,25,"Al Fahidi Historical District Building 54 & 55, Dubaï 118131 Émirats arabes unis");
        Restaurants resto6 = new Restaurants("Ayamna","Libanaise, Moyen-Orient",50, 150,"Crescent road The Palm Atlantis, The Palm, Dubaï Émirats arabes unis");
        Restaurants resto7 = new Restaurants("Epulon Food and Wine","Fruits de mer & Poisson,Méditerranéenne,Européenne",7,21,"Epulonova Ul 4, Pula 52100 Croatie");
        Restaurants resto8 = new Restaurants("Vodnjanka - Trattoria","Fruits de mer & Poisson,Méditerranéenne,Européenne",15,50,"Viteziceva Ulica 4, Pula 52100 Croatie");

        restaurantsRepositoryInterface.save(resto1);
        restaurantsRepositoryInterface.save(resto2);
        restaurantsRepositoryInterface.save(resto3);
        restaurantsRepositoryInterface.save(resto4);
        restaurantsRepositoryInterface.save(resto5);
        restaurantsRepositoryInterface.save(resto6);
        restaurantsRepositoryInterface.save(resto7);
        restaurantsRepositoryInterface.save(resto8);
        return ("OK");
    }

    @GetMapping("/getAllRestaurants")
    public List<Restaurants> getAllRestaurants() {
        List<Restaurants> restos = restaurantsRepositoryInterface.findAll();
        return restos;
    }

    @PostMapping("/recuperationSitesTouristiques")
    public String recuperationSitesTouristiques(@RequestBody SitesTouristiques tourisme) {
        System.out.println(tourisme);
        sitesTouristiquesRepositoryInterface.save(tourisme);
        return "OK";
    }


    //........Mettre des Restaurants dans les Villes.....//

    @PostMapping("/recuperationMultiRestaurants")
    public String recuperationMultiRestaurants(@RequestBody Restaurants restaurant) {
        System.out.println(restaurant);
        Villes ville= villesRepositoryInterface.findByNom(restaurant.getNomVille());
        ville.ajouterRestaurants(restaurant);
        System.out.println(ville);
        villesRepositoryInterface.save(ville);
        return "OK";
    }


    //.....Mettre des Transports dans les Villes....//

    @PostMapping("/recuperationMultiTransports")
    public String recuperationMultiTransports(@RequestBody Transports transport) {
        System.out.println(transport);
        Villes ville= villesRepositoryInterface.findByNom(transport.getNomVille());
        ville.ajouterTransports(transport);
        System.out.println(ville);
        villesRepositoryInterface.save(ville);
        return "OK";
    }

    //.....Mettre des Sites Touristiques dans les Villes....//
    @PostMapping("/recuperationMultiSitesTouristiques")
    public String recuperationMultiSitesTouristiques(@RequestBody SitesTouristiques sitesTouristiques) {
        System.out.println(sitesTouristiques);
        Villes villes= villesRepositoryInterface.findByNom(sitesTouristiques.getNomVilles());
        villes.ajouterSitesTouristiques(sitesTouristiques);
        System.out.println(villes);
        villesRepositoryInterface.save(villes);
        return "OK";
    }

    //.....Mettre des Commentaires sur les Restaurants....//
    @PostMapping("/recuperationMultiCommentairesRestaurants")
    public String recuperationMultiCommentairesRestaurants(@RequestBody Commentaires commentaires) {
        System.out.println(commentaires);
        Restaurants restaurants= restaurantsRepositoryInterface.findByNom(commentaires.getNomRestaurants());
        restaurants.ajouterCommentairesRestaurants(commentaires);
        System.out.println(restaurants);
        restaurantsRepositoryInterface.save(restaurants);
        return "OK";
    }

    //.....Mettre des Commentaires sur les Sites Touristiques....//
    @PostMapping("/recuperationMultiCommentairesSitesTouristiques")
    public String recuperationMultiCommentairesSitesTouristiques(@RequestBody Commentaires commentaires) {
        System.out.println(commentaires);
        SitesTouristiques sitesTouristiques= sitesTouristiquesRepositoryInterface.findByNom(commentaires.getNomSitesTouristiques());
        sitesTouristiques.ajouterCommentairesSitesTouristiques(commentaires);
        System.out.println(sitesTouristiques);
        sitesTouristiquesRepositoryInterface.save(sitesTouristiques);
        return "OK";
    }


}


