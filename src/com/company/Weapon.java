package com.company;

public class Weapon extends Item {
    WeaponType type;
    int damage;
    double attacksPerSecond;
    double dmgPerSecond;

    public Weapon(String name, int lvlRequirement, WeaponType type, int damage, double attacksPerSecond, double dmgPerSecond) {
        super(name, lvlRequirement);
        this.type = type;
        this.damage = damage;
        this.attacksPerSecond = attacksPerSecond;
        this.dmgPerSecond = dmgPerSecond;
    }
}
