package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Warrior extends Character {
    public Warrior(String name) {
        super(
                name,
                new PrimaryAttributes(10, 5, 2, 1),
                new PrimaryAttributes(5, 3, 2, 1),
                new ArrayList<ArmorType>(Arrays.asList(ArmorType.MAIL, ArmorType.PLATE)),
                new ArrayList<WeaponType>(Arrays.asList(WeaponType.AXE, WeaponType.HAMMER, WeaponType.SWORD))
        );
    }
}
