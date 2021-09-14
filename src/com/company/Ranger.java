package com.company;

public class Ranger extends Character {

    public Ranger(String name) {
        super(
                name,
                new PrimaryAttributes(8, 1, 7, 1),
                new PrimaryAttributes(2, 1, 5, 1));
    }
}
