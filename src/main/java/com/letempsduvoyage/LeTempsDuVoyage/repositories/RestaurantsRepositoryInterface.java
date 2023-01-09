package com.letempsduvoyage.LeTempsDuVoyage.repositories;

import com.letempsduvoyage.LeTempsDuVoyage.beans.Restaurants;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantsRepositoryInterface extends JpaRepository<Restaurants, Integer> {
}
