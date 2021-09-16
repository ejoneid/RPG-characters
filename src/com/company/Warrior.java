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

    @Override
    public double getDPS() {
        double dps;
        try {
            dps = (this.getWeapon().getDPS() * (1 + this.getBaseAttributes().strength / 100));
        } catch (NullPointerException error) {
            dps = 1 * (1 + this.getBaseAttributes().strength / 100);
        }
        return dps;
    }
}
