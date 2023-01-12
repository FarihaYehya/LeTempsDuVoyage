package com.letempsduvoyage.LeTempsDuVoyage.repositories;

import com.letempsduvoyage.LeTempsDuVoyage.beans.SitesTouristiques;
import com.letempsduvoyage.LeTempsDuVoyage.beans.Transports;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransportsRepositoryInterface extends JpaRepository<Transports, Integer> {
}
