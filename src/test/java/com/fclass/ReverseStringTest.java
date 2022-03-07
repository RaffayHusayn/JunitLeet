package com.fclass;

import org.junit.jupiter.api.Test;
import  org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ReverseStringTest {

    @Test
    void reverse() {
        ReverseString reverseString = new ReverseString();

        assertEquals("raffay", reverseString.reverse("yaffar"));
        assertEquals("", reverseString.reverse(null));
        assertEquals("", reverseString.reverse(""));
        assertEquals("R!@", reverseString.reverse("@!R"));
    }
}