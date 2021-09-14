package com.company;

public class Mage extends Character{
    public Mage(String name) {
        super(
                name,
                new PrimaryAttributes(5, 1, 1, 8),
                new PrimaryAttributes(3, 1, 1, 5)
        );
    }


}
