package com.company;

public class Rogue extends Character {

    public Rogue(String name) {
        super(
                name,
                new PrimaryAttributes(8, 2, 6, 1),
                new PrimaryAttributes(3, 1, 4, 1)
        );
    }
}
