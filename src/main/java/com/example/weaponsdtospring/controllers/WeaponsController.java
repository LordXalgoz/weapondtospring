package com.example.weaponsdtospring.controllers;

import com.example.weaponsdtospring.dtos.WeaponDto;
import com.example.weaponsdtospring.services.WeaponsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/weapons", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class WeaponsController {

    @Autowired
    private final WeaponsServices weaponsServices;

    public WeaponsController(WeaponsServices weaponsServices) {
        this.weaponsServices = weaponsServices;
    }

    @GetMapping(value = "/getAll")
    public List<WeaponDto> getAll() throws Exception {
        return weaponsServices.getAll();
    }
}
