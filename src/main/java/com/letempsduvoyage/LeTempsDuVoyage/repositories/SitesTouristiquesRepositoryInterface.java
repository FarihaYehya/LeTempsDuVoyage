package com.letempsduvoyage.LeTempsDuVoyage.repositories;

import com.letempsduvoyage.LeTempsDuVoyage.beans.Restaurants;
import com.letempsduvoyage.LeTempsDuVoyage.beans.SitesTouristiques;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SitesTouristiquesRepositoryInterface extends JpaRepository<SitesTouristiques, Integer> {
    SitesTouristiques findByNom(String nom);
}
