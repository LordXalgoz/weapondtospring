package com.example.weaponsdtospring.repositories;

import com.example.weaponsdtospring.models.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeaponsRepository extends JpaRepository<Weapon, Integer> {
}
