package com.company;


public class Armor extends Item {
    PrimaryAttributes attributes;
    ArmorType type;

    public Armor(String name, int lvlRequirement, ItemSlot itemSlot, PrimaryAttributes attributes, ArmorType type) {
        super(name, lvlRequirement, itemSlot);
        this.attributes = attributes;
        this.type = type;
    }

    @Override
    public boolean canBeEquipedByCharacter(Character character) throws InvalidArmorException {
        if (character.getLvl() < this.getLvlRequirement()) {
            throw new InvalidArmorException("Not high enough level for this item!");
        }

        if (!character.getAcceptableArmorTypes().contains(this.type)) {
            throw new InvalidArmorException("This character cannot use this armortype!");
        }

        return true;
    }

    @Override
    public double getDPS() {
        return 0;
    }
}