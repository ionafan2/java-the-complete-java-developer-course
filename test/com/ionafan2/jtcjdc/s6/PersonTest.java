package com.ionafan2.jtcjdc.s6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testAll() {

        Person person = new Person();

        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        assertEquals("", person.getFullName());
        assertFalse(person.isTeen());

        person.setFirstName("John");
        person.setAge(18);
        assertEquals("John", person.getFullName());
        assertTrue(person.isTeen());

        person.setLastName("Smith");
        assertEquals("John Smith", person.getFullName());
    }
}