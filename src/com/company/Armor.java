package com.company;


public class Armor extends Item {
    PrimaryAttributes attributes;
    ArmorType type;

    public Armor(String name, int lvlRequirement, PrimaryAttributes attributes, ArmorType type) {
        super(name, lvlRequirement);
        this.attributes = attributes;
        this.type = type;
    }
}