package com.example.weaponsdtospring.dtos;

import com.example.weaponsdtospring.models.Weapon;
import lombok.Data;

import java.util.Set;

@Data
public class CountryDto {
    public int id;
    public String name;
    public Set<Weapon> weapons;
}
