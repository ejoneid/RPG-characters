package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void TestEquipingItemReturnsTrue() throws Exception {
        Warrior warrior = new Warrior("tester");
        Item weapon = new Weapon("testWeapon", 1, WeaponType.AXE, 6, 1.5);

        boolean actual = warrior.equip(weapon);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void TestWeaponExceptionIfRequiredLvlTooHigh() {
        Warrior warrior = new Warrior("tester");
        Item weapon = new Weapon("testWeapon", 2, WeaponType.AXE, 6, 1.5);

        assertThrows(InvalidWeaponException.class, () -> { warrior.equip(weapon); });
    }

    @Test
    void TestArmorExceptionIfRequiredLvlTooHigh() {
        Warrior warrior = new Warrior("tester");
        PrimaryAttributes armorAttributes = new PrimaryAttributes(20, -3, 0, 0 );
        Item armor = new Armor("testArmor", 2, ItemSlot.BODY, armorAttributes, ArmorType.PLATE);

        assertThrows(InvalidArmorException.class, () -> { warrior.equip(armor); });
    }

    @Test
    void TestWeaponExceptionIfInvalidType() {
        Warrior warrior = new Warrior("tester");
        Item weapon = new Weapon("testWeapon", 1, WeaponType.BOW, 6, 1.5);

        assertThrows(InvalidWeaponException.class, () -> { warrior.equip(weapon); });
    }

    @Test
    void TestArmorExceptionIfInvalidType() {
        Warrior warrior = new Warrior("tester");
        PrimaryAttributes armorAttributes = new PrimaryAttributes(20, -3, 0, 0 );
        Item armor = new Armor("testArmor", 1, ItemSlot.BODY, armorAttributes, ArmorType.CLOTH);

        assertThrows(InvalidArmorException.class, () -> { warrior.equip(armor); });
    }

}