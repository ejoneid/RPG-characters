package com.company;

public class Weapon extends Item {
    WeaponType type;
    int damage;
    double attacksPerSecond;

    public Weapon(String name, int lvlRequirement, WeaponType type, int damage, double attacksPerSecond) {
        super(name, lvlRequirement, ItemSlot.WEAPON);
        this.type = type;
        this.damage = damage;
        this.attacksPerSecond = attacksPerSecond;
    }

    @Override
    public double getDPS() {
        return damage * attacksPerSecond;
    }

    @Override
    public boolean canBeEquipedByCharacter(Character character) throws InvalidWeaponException {
        if (character.getLvl() < this.getLvlRequirement()) {
            throw new InvalidWeaponException("Not high enough level for this item!");
        }

        if (!character.getAcceptableWeaponTypes().contains(this.type)) {
            throw new InvalidWeaponException("This character cannot use this weapontype!");
        }

        return true;
    }
}
