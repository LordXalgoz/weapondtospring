package com.example.weaponsdtospring.repositories;

import com.example.weaponsdtospring.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountriesRepositories extends JpaRepository<Country, Integer> {
}
