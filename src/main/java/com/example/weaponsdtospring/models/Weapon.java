package com.example.weaponsdtospring.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "weapons")
public class Weapon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column
    public String name;
    @Column
    public String description;
    @Column
    public String material;
    @Column
    public int price;
    @Column
    public double rating;
    @Column
    public int amount;
    @ManyToOne
    @JoinColumn(name="id_country")
    public Country country;
}
