package com.example.weaponsdtospring.dtos;

import com.example.weaponsdtospring.models.Country;
import lombok.Data;
//f
@Data
public class WeaponDto {
    public int id;
    public String name;
    public int price;
    public double rating;
    public Country countryName;
}
