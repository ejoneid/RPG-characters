package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Ranger extends Character {

    public Ranger(String name) {
        super(
                name,
                new PrimaryAttributes(8, 1, 7, 1),
                new PrimaryAttributes(2, 1, 5, 1),
                new ArrayList<ArmorType>(Arrays.asList(ArmorType.LEATHER, ArmorType.MAIL)),
                new ArrayList<WeaponType>(Arrays.asList(WeaponType.BOW))
        );
    }
}
