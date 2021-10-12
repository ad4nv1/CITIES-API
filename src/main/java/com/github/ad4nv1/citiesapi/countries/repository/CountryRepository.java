package com.github.ad4nv1.citiesapi.countries.repository;

import com.github.ad4nv1.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
