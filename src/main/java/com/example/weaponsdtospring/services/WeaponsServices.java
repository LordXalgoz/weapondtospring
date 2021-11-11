package com.example.weaponsdtospring.services;

import com.example.weaponsdtospring.dtos.WeaponDto;
import com.example.weaponsdtospring.repositories.WeaponsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WeaponsServices {
    @Autowired
    private final WeaponsRepository weaponsRepository;

    @Autowired
    private final ModelMapper modelMapper;

    public WeaponsServices(WeaponsRepository weaponsRepository, ModelMapper modelMapper) {
        this.weaponsRepository = weaponsRepository;
        this.modelMapper = modelMapper;
    }

    public List<WeaponDto> getAll(){
        return weaponsRepository.findAll().stream().
                map(weapon -> modelMapper.map(weapon, WeaponDto.class))
                .collect(Collectors.toList());
    }
}
