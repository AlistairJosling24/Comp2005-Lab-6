package com.example.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageTest {

    @Test
    void getMessage() {
        String expected = "Hello there!";

        String actual = Message.getMessage();

        assertEquals(actual, expected);
        //workflow test
    }
}