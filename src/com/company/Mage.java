package com.company;

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
}
