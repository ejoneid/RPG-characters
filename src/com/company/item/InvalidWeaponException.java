package com.company.item;

public class InvalidWeaponException extends Exception {
    public InvalidWeaponException(String errorMsg) {
        super(errorMsg);
    }
}
