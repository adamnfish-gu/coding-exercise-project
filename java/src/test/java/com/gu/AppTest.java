package com.gu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testApp() {
        assertEquals("Hello C. P. Scott!", App.greet("C. P. Scott"));
    }

}
