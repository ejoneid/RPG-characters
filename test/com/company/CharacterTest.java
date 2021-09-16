package com.company;

import com.company.character.*;
import com.company.character.Character;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @Test
    void TestLvl1() {
        Character mage = new Mage("TestMage");
        assertEquals(1, mage.getLvl());
    }

    @Test
    void TestMageBaseAttributes() {
        Character mage = new Mage("TestMage");

        PrimaryAttributes actual = mage.getBaseAttributes();
        PrimaryAttributes expected = new PrimaryAttributes(5, 1, 1, 8);

        assertEquals(expected, actual);
    }

    @Test
    void TestRangerBaseAttributes() {
        Character ranger = new Ranger("TestRanger");

        PrimaryAttributes actual = ranger.getBaseAttributes();
        PrimaryAttributes expected = new PrimaryAttributes(8, 1, 7, 1);

        assertEquals(expected, actual);
    }

    @Test
    void TestRogueBaseAttributes() {
        Character rogue = new Rogue("TestRogue");

        PrimaryAttributes actual = rogue.getBaseAttributes();
        PrimaryAttributes expected = new PrimaryAttributes(8, 2, 6, 1);

        assertEquals(expected, actual);
    }

    @Test
    void TestWarriorBaseAttributes() {
        Character warrior = new Warrior("TestWarrior");

        PrimaryAttributes actual = warrior.getBaseAttributes();
        PrimaryAttributes expected = new PrimaryAttributes(10, 5, 2, 1);

        assertEquals(expected, actual);
    }

    @Test
    void TestLevelUp() {
        Character mage = new Mage("TestMage");
        mage.levelUp();
        assertEquals(2, mage.getLvl());
    }

    @Test
    void TestMageAttributesIncrease() {
        Character mage = new Mage("Test");

        mage.levelUp();
        PrimaryAttributes actual = mage.getBaseAttributes();
        PrimaryAttributes expected = new PrimaryAttributes(8, 2, 2, 13);

        assertEquals(expected, actual);
    }

    @Test
    void TestRangerAttributesIncrease() {
        Character ranger = new Ranger("Test");

        ranger.levelUp();
        PrimaryAttributes actual = ranger.getBaseAttributes();
        PrimaryAttributes expected = new PrimaryAttributes(10, 2, 12, 2);

        assertEquals(expected, actual);
    }

    @Test
    void TestRogueAttributesIncrease() {
        Character rogue = new Rogue("Test");

        rogue.levelUp();
        PrimaryAttributes actual = rogue.getBaseAttributes();
        PrimaryAttributes expected = new PrimaryAttributes(11, 3, 10, 2);

        assertEquals(expected, actual);
    }

    @Test
    void TestWarriorAttributesIncrease() {
        Character warrior = new Warrior("Test");

        warrior.levelUp();
        PrimaryAttributes actual = warrior.getBaseAttributes();
        PrimaryAttributes expected = new PrimaryAttributes(15, 8, 4, 2);

        assertEquals(expected, actual);
    }
}