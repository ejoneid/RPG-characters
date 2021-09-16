package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void TestEquipingItemReturnsTrue() throws Exception {
        Character warrior = new Warrior("tester");
        Item weapon = new Weapon("testWeapon", 1, WeaponType.AXE, 6, 1.5);

        boolean actual = warrior.equip(weapon);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void TestWeaponExceptionIfRequiredLvlTooHigh() {
        Character warrior = new Warrior("tester");
        Item weapon = new Weapon("testWeapon", 2, WeaponType.AXE, 6, 1.5);

        assertThrows(InvalidWeaponException.class, () -> { warrior.equip(weapon); });
    }

    @Test
    void TestArmorExceptionIfRequiredLvlTooHigh() {
        Character warrior = new Warrior("tester");
        PrimaryAttributes armorAttributes = new PrimaryAttributes(20, -3, 0, 0 );
        Item armor = new Armor("testArmor", 2, ItemSlot.BODY, armorAttributes, ArmorType.PLATE);

        assertThrows(InvalidArmorException.class, () -> { warrior.equip(armor); });
    }

    @Test
    void TestWeaponExceptionIfInvalidType() {
        Character warrior = new Warrior("tester");
        Item weapon = new Weapon("testWeapon", 1, WeaponType.BOW, 6, 1.5);

        assertThrows(InvalidWeaponException.class, () -> { warrior.equip(weapon); });
    }

    @Test
    void TestArmorExceptionIfInvalidType() {
        Character warrior = new Warrior("tester");
        PrimaryAttributes armorAttributes = new PrimaryAttributes(20, -3, 0, 0 );
        Item armor = new Armor("testArmor", 1, ItemSlot.BODY, armorAttributes, ArmorType.CLOTH);

        assertThrows(InvalidArmorException.class, () -> { warrior.equip(armor); });
    }

    @Test
    void TestDPSWithoutWeapon() {
        Character warrior = new Warrior("tester");

        double actual = warrior.getDPS();
        double expected = 1 * (1 + (5 / 100));

        assertEquals(expected, actual);
    }

    @Test
    void TestDPSWithWeapon() throws Exception {
        Character warrior = new Warrior("tester");
        Item axe = new Weapon("testAxe", 1, WeaponType.AXE, 7, 1.1);
        warrior.equip(axe);

        double actual = warrior.getDPS();
        double expected =  (7 * 1.1)*(1 + (5 / 100));

        assertEquals(expected, actual);
    }

    @Test
    void TestDPSWithWeaponAndArmor() throws Exception {
        Character warrior = new Warrior("tester");
        Item axe = new Weapon("testAxe", 1, WeaponType.AXE, 7, 1.1);
        warrior.equip(axe);
        PrimaryAttributes armorAttributes = new PrimaryAttributes(2, 1, 0, 0);
        Item armorPlate = new Armor("testArmor", 1, ItemSlot.BODY, armorAttributes, ArmorType.PLATE);
        warrior.equip(armorPlate);

        double actual = warrior.getDPS();
        double expected =  (7 * 1.1) * (1 + ((5+1) / 100));

        assertEquals(expected, actual);
    }

}