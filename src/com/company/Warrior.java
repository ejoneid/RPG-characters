package com.company;

public class Warrior extends Character {
    public Warrior(String name) {
        super(
                name,
                new PrimaryAttributes(10, 5, 2, 1),
                new PrimaryAttributes(5, 3, 2, 1)
        );
    }
}
