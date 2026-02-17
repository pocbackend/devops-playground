package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testHelloWorldOutput() {
        // This is a very basic test
        String expected = "Hello, World!";
        String actual = "Hello, World!"; // In real tests, you'd call a method
        assertEquals(expected, actual);
    }
}
