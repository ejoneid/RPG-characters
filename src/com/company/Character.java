package com.company;

public abstract class Character {
    private String name;
    private int lvl = 1;
    private PrimaryAttributes baseAttributes;
    private PrimaryAttributes attributesgrowth;
    private Equipment equipment = new Equipment(null, null, null, null);

    public Character(String name, PrimaryAttributes baseAttributes, PrimaryAttributes attributesgrowth) {
        this.name = name;
        this.baseAttributes = baseAttributes;
        this.attributesgrowth = attributesgrowth;
    }

    public void levelUp() {
        this.lvl++;
        this.baseAttributes.add(this.attributesgrowth);
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
                ", attributesgrowth=" + attributesgrowth +
                ", equipment=" + equipment +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getLvl() {
        return lvl;
    }

    public PrimaryAttributes getBaseAttributes() {
        return baseAttributes;
    }

    public Equipment getEquipment() {
        return equipment;
    }
}
