package com.company;

import com.company.character.PrimaryAttributes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimaryAttributesTest {

    @Test
    void TestAddingAttributesObjects() {
        PrimaryAttributes actual = new PrimaryAttributes(1,2,3,4);
        PrimaryAttributes at2 = new PrimaryAttributes(5,6,7,8);

        actual.add(at2);
        PrimaryAttributes expected = new PrimaryAttributes(6, 8, 10, 12);

        assertEquals(expected, actual);
    }
}