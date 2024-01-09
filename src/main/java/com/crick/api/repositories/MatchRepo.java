package com.crick.api.repositories;

import com.crick.api.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<com.crick.api.entities.Match,Integer> {

    Optional<Match> findByTeamHeading(String teamHeading);

}