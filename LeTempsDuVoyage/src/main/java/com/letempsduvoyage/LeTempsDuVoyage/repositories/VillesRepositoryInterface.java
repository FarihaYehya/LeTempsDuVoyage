package com.letempsduvoyage.LeTempsDuVoyage.repositories;

import com.letempsduvoyage.LeTempsDuVoyage.beans.Villes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VillesRepositoryInterface extends JpaRepository<Villes,Integer>{

    Villes findById(int idVilles);
    Villes findByNom(String nom);
}
