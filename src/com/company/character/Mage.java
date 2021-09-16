package com.company.character;

import com.company.item.ArmorType;
import com.company.item.WeaponType;

import java.util.ArrayList;
import java.util.Arrays;

public class Mage extends Character{

    public Mage(String name) {
        super(
                name,
                new PrimaryAttributes(5, 1, 1, 8),
                new PrimaryAttributes(3, 1, 1, 5),
                new ArrayList<ArmorType>(Arrays.asList(ArmorType.CLOTH)),
                new ArrayList<WeaponType>(Arrays.asList(WeaponType.STAFF, WeaponType.WAND))
        );
    }

    @Override
    public double getDPS() {
        return (this.getWeapon().getDPS() * (1 + this.getBaseAttributes().intelligence / 100));
    }
}
