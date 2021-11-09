package com.example.weaponsdtospring.services;

import com.example.weaponsdtospring.repositories.CountriesRepositories;
import com.example.weaponsdtospring.repositories.WeaponsRepositories;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountriesServices {
    @Autowired
    private final CountriesRepositories countriesRepositories;

    @Autowired
    private final WeaponsRepositories weaponsRepositories;

    @Autowired
    private final ModelMapper modelMapper;

    public CountriesServices(CountriesRepositories countriesRepository, WeaponsRepositories weaponsRepositories, ModelMapper modelMapper) {
        this.countriesRepositories = countriesRepository;
        this.weaponsRepositories = weaponsRepositories;
        this.modelMapper = modelMapper;
    }
}
