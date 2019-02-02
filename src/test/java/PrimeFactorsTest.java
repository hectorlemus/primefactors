import org.junit.Ignore;
import org.junit.Test;
import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PrimeFactorsTest {


    // testPrimeNumbersHaveThemSelfAsPrimeFactors
    @Test
    public void testPrimeNumbersHaveThemSelfAsPrimeFactors() {
        assertTrue(PrimeFactors.of(1).isEmpty());
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList(2), PrimeFactors.of(2));
    }

    @Test
    public void test3() {
        assertEquals(Arrays.asList(3), PrimeFactors.of(3));
    }

    // testNumbersWiththeSamePrimeFactor
    @Test
    public void testNumbersWiththeSamePrimeFactor() {
        assertEquals(Arrays.asList(2,2), PrimeFactors.of(4));
    }

    @Test
    public void test5() {
        assertEquals(Arrays.asList(5), PrimeFactors.of(5));
    }

    @Test
    public void testNumbersWithDifferentPrimeFactor() {
        assertEquals(Arrays.asList(2,3), PrimeFactors.of(6));
    }

    @Test
    public void test7() {
        assertEquals(Arrays.asList(7), PrimeFactors.of(7));
    }

    @Test
    public void test8() {
        assertEquals(Arrays.asList(2,2,2), PrimeFactors.of(8));
    }

    @Test
    public void test9() {
        assertEquals(Arrays.asList(3,3), PrimeFactors.of(9));
    }

}
