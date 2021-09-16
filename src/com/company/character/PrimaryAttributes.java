package com.company.character;

import java.util.Objects;

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

    public void add(PrimaryAttributes attributesToAdd) {
        this.vitality = this.vitality + attributesToAdd.vitality;
        this.strength = this.strength + attributesToAdd.strength;
        this.dexterity = this.dexterity + attributesToAdd.dexterity;
        this.intelligence = this.intelligence + attributesToAdd.intelligence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrimaryAttributes that = (PrimaryAttributes) o;
        return vitality == that.vitality && strength == that.strength && dexterity == that.dexterity && intelligence == that.intelligence;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vitality, strength, dexterity, intelligence);
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
