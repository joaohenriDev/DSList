package com.joaoportfolio.dslist.repositories;

import com.joaoportfolio.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
