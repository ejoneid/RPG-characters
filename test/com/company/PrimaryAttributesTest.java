package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimaryAttributesTest {

    @Test
    void TestJoiningAttributesObjects() {
        PrimaryAttributes at1 = new PrimaryAttributes(1,1,1,1);
        PrimaryAttributes at2 = new PrimaryAttributes(2,2,2,2);

        PrimaryAttributes actual = at1.add(at2);
        PrimaryAttributes expected = new PrimaryAttributes(3, 3, 3, 3);

        assertEquals(expected.dexterity, actual.dexterity);
        assertEquals(expected.intelligence, actual.intelligence);
        assertEquals(expected.strength, actual.strength);
        assertEquals(expected.vitality, actual.vitality);
    }
}