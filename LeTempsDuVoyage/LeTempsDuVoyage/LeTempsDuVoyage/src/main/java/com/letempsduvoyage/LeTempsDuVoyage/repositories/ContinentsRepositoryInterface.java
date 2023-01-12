package com.letempsduvoyage.LeTempsDuVoyage.repositories;

import com.letempsduvoyage.LeTempsDuVoyage.beans.Continents;
import com.letempsduvoyage.LeTempsDuVoyage.beans.Villes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContinentsRepositoryInterface extends JpaRepository<Continents, Integer> {
    Continents findByNom(String nom);
}
