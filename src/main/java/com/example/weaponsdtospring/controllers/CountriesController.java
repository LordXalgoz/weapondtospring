package com.example.weaponsdtospring.controllers;

import com.example.weaponsdtospring.services.CountriesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/countries", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class CountriesController {

    @Autowired
    private final CountriesServices countriesServices;

    public CountriesController(CountriesServices countriesServices) {
        this.countriesServices = countriesServices;
    }
}
