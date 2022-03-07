package com.fclass;

import org.junit.jupiter.api.Test;
import  org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class ReverseStringTest {

    @Test
    void reverse() throws Exception {
        ReverseString reverseString = new ReverseString();

        assertThrows(Exception.class,() -> reverseString.reverse(null), "Exception for null failed");
        assertEquals("raffay", reverseString.reverse("yaffar"));
        assertEquals("", reverseString.reverse(""));
        assertEquals("R!@", reverseString.reverse("@!R"));
    }
}