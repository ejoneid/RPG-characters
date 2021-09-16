package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Rogue extends Character {

    public Rogue(String name) {
        super(
                name,
                new PrimaryAttributes(8, 2, 6, 1),
                new PrimaryAttributes(3, 1, 4, 1),
                new ArrayList<ArmorType>(Arrays.asList(ArmorType.LEATHER, ArmorType.MAIL)),
                new ArrayList<WeaponType>(Arrays.asList(WeaponType.DAGGER, WeaponType.SWORD))
        );
    }

    @Override
    public double getDPS() {
        return (this.getWeapon().getDPS() * (1 + this.getBaseAttributes().dexterity / 100));
    }
}
