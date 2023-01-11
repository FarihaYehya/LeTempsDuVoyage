package com.letempsduvoyage.LeTempsDuVoyage.repositories;

import com.letempsduvoyage.LeTempsDuVoyage.beans.Commentaires;
import com.letempsduvoyage.LeTempsDuVoyage.beans.Continents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentairesRepositoryInterface extends JpaRepository<Commentaires, Integer> {

}
