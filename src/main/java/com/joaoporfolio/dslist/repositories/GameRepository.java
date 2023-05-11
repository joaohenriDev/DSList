package com.joaoporfolio.dslist.repositories;

import com.joaoporfolio.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
