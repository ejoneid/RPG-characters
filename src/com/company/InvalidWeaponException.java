package com.company;

public class InvalidWeaponException extends Exception {
    public InvalidWeaponException(String errorMsg) {
        super(errorMsg);
    }
}
