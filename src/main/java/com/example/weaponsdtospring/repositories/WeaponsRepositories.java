package com.example.weaponsdtospring.repositories;

import com.example.weaponsdtospring.models.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeaponsRepositories extends JpaRepository<Weapon, Integer> {
}
