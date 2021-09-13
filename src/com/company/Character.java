package com.company;

public abstract class Character {
    private String name;
    private int lvl = 1;
    private PrimaryAttributes baseAttributes;
    private PrimaryAttributes attributesgrowth;
    private Equipment equipment;

    public void levelUp() {
        this.lvl++;
        baseAttributes.add(attributesgrowth);
    }

    public Character(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", lvl=" + lvl +
                ", baseAttributes=" + baseAttributes +
                ", attributesgrowth=" + attributesgrowth +
                ", equipment=" + equipment +
                '}';
    }
}
