package com.example.weaponsdtospring.services;

import com.example.weaponsdtospring.repositories.CountriesRepository;
import com.example.weaponsdtospring.repositories.WeaponsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountriesServices {
    @Autowired
    private final CountriesRepository countriesRepository;

    @Autowired
    private final WeaponsRepository weaponsRepository;

    @Autowired
    private final ModelMapper modelMapper;

    public CountriesServices(CountriesRepository countriesRepository, WeaponsRepository weaponsRepository, ModelMapper modelMapper) {
        this.countriesRepository = countriesRepository;
        this.weaponsRepository = weaponsRepository;
        this.modelMapper = modelMapper;
    }
}
