package org.feefo.normaliser;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NormaliserTest {

    @Test
    void testNormalise() {
        Normaliser normaliser = new Normaliser();

        assertEquals("Software engineer", normaliser.normalise("Java engineer"));
        assertEquals("Software engineer", normaliser.normalise("C# engineer"));
        assertEquals("Accountant", normaliser.normalise("Chief Accountant"));
        assertEquals("Accountant", normaliser.normalise("Accountant"));
    }
}
