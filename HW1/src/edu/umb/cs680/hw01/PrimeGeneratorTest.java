package edu.umb.cs680.hw01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PrimeGeneratorTest {
    @Test
    public void PrimesFrom1To10() {
        PrimeGenerator gen = new PrimeGenerator(1, 10);
        gen.generatePrimes();
        Long[] expectedPrimes = {2L, 3L, 5L, 7L};
        assertArrayEquals(expectedPrimes, gen.getPrimes().toArray());
    }

    @Test
    public void NegativePrimesTest() {
        try {
            PrimeGenerator gen = new PrimeGenerator(-10, 10);
            fail("Wrong input values: from=-10 to=10");
        } catch (RuntimeException e) {
            assertEquals("Wrong input values: from=-10 to=10" , e.getMessage());
        }
    }

    @Test
    public void InversePrimesTest() {
        try {
            PrimeGenerator gen = new PrimeGenerator(100, 1);
            fail("Wrong input values: from=100 to=1");
        } catch (RuntimeException e) {
            assertEquals("Wrong input values: from=100 to=1", e.getMessage());
        }
    }
}