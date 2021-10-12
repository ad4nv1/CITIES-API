package com.github.ad4nv1.citiesapi.states.repository;

import com.github.ad4nv1.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}