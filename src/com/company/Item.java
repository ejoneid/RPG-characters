package com.company;

public abstract class Item {
    String name;
    int lvlRequirement;
    ItemSlot itemSlot;

    public Item(String name, int lvlRequirement, ItemSlot itemSlot) {
        this.name = name;
        this.lvlRequirement = lvlRequirement;
        this.itemSlot = itemSlot;
    }

    public Item() {}
}