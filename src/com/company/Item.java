package com.company;

public abstract class Item {
    private String name;
    private int lvlRequirement;
    private ItemSlot itemSlot;

    public Item(String name, int lvlRequirement, ItemSlot itemSlot) {
        this.name = name;
        this.lvlRequirement = lvlRequirement;
        this.itemSlot = itemSlot;
    }

    public int getLvlRequirement() {
        return lvlRequirement;
    }

    public ItemSlot getItemSlot() {
        return itemSlot;
    }

    public abstract boolean canBeEquipedByCharacter(Character character) throws Exception;
}