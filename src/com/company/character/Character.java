package com.company.character;

import com.company.item.*;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Character {
    private String name;
    private int lvl = 1;
    private PrimaryAttributes baseAttributes;
    private PrimaryAttributes attributesGrowth;
    private HashMap<ItemSlot, Item> equipment = new HashMap<>();
    private ArrayList<ArmorType> acceptableArmorTypes;
    private ArrayList<WeaponType> acceptableWeaponTypes;

    public Character(
            String name,
            PrimaryAttributes baseAttributes,
            PrimaryAttributes attributesGrowth,
            ArrayList<ArmorType> acceptableArmorTypes,
            ArrayList<WeaponType> acceptableWeaponTypes
    ) {
        this.name = name;
        this.baseAttributes = baseAttributes;
        this.attributesGrowth = attributesGrowth;
        this.acceptableArmorTypes = acceptableArmorTypes;
        this.acceptableWeaponTypes = acceptableWeaponTypes;
    }

    public abstract double getDPS();

//    Equips an item if it is of an acceptable item type.
//    If it isnt the correct exception is thrown by the canBeEquipedByCharacter funcion.
    public boolean equip(Item item) throws Exception {
        if (item.canBeEquipedByCharacter(this)) {
            equipment.put(item.getItemSlot(), item);
            return true;
        }
        return false;
    }

    public void levelUp() {
        this.lvl++;
        this.baseAttributes.add(this.attributesGrowth);
    }

    public void levelUp(int lvls) {
        for (int i = 0; i < lvls; i++) {
            levelUp();
        }
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", lvl=" + lvl +
                ", baseAttributes=" + baseAttributes +
                ", attributesgrowth=" + attributesGrowth +
                ", equipment=" + equipment +
                '}';
    }

    public int getLvl() {
        return lvl;
    }

    public PrimaryAttributes getBaseAttributes() {
        return baseAttributes;
    }

    public ArrayList<ArmorType> getAcceptableArmorTypes() {
        return acceptableArmorTypes;
    }

    public ArrayList<WeaponType> getAcceptableWeaponTypes() {
        return acceptableWeaponTypes;
    }

    public Item getWeapon() {
        return this.equipment.get(ItemSlot.WEAPON);
    }
}
