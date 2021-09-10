package com.company;

public class PrimaryAttributes {
    protected int vitality;
    protected int strength;
    protected int dexterity;
    protected int intelligence;

    public PrimaryAttributes(int vitality, int strength, int dexterity, int intelligence) {
        this.vitality = vitality;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    public PrimaryAttributes add(PrimaryAttributes attributesToAdd) {
        int newVitality = this.vitality + attributesToAdd.vitality;
        int newStrength = this.strength + attributesToAdd.strength;
        int newDexterity = this.dexterity + attributesToAdd.dexterity;
        int newIntelligence = this.intelligence + attributesToAdd.intelligence;

        return new PrimaryAttributes(newVitality, newStrength, newDexterity, newIntelligence);
    }

    @Override
    public String toString() {
        return "PrimaryAttributes{" +
                "vitality=" + vitality +
                ", strength=" + strength +
                ", dexterity=" + dexterity +
                ", intelligence=" + intelligence +
                '}';
    }
}
