import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
    // --------------------------------------------------------------- //
    @Test
    public void TestNegativeNumbers() {
        for (int i = -10; i < 0; ++i) {
            assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
        }
    }

    // --------------------------------------------------------------- //
    @Test
    public void TestEdgeCases() {
        assertEquals("Test 0", false, PrimeCheck.isPrime(0));
        assertEquals("Test 1", false, PrimeCheck.isPrime(1));
        assertEquals("Test 2", true, PrimeCheck.isPrime(2));
    }

    // --------------------------------------------------------------- //
    @Test
    public void testPrimes() {
        /* ToDo: insert a test here */
        assertEquals("Test 3", true, PrimeCheck.isPrime(3));
        assertEquals("Test 5", true, PrimeCheck.isPrime(5));
        assertEquals("Test 7", true, PrimeCheck.isPrime(7));
        assertEquals("Test 11", true, PrimeCheck.isPrime(11));
        assertEquals("Test 13", true, PrimeCheck.isPrime(13));
        assertEquals("Test 17", true, PrimeCheck.isPrime(17));
        assertEquals("Test 19", true, PrimeCheck.isPrime(19));
        assertEquals("Test 23", true, PrimeCheck.isPrime(23));
        assertEquals("Test 29", true, PrimeCheck.isPrime(29));
        assertEquals("Test 31", true, PrimeCheck.isPrime(31));
    }

    // --------------------------------------------------------------- //
    @Test
    public void testNonPrimes() {
        /* ToDo: insert a test here */
        assertEquals("Test 4", false, PrimeCheck.isPrime(4));
        assertEquals("Test 6", false, PrimeCheck.isPrime(6));
        assertEquals("Test 8", false, PrimeCheck.isPrime(8));
        assertEquals("Test 9", false, PrimeCheck.isPrime(9));
        assertEquals("Test 10", false, PrimeCheck.isPrime(10));
        assertEquals("Test 12", false, PrimeCheck.isPrime(12));
        assertEquals("Test 14", false, PrimeCheck.isPrime(14));
        assertEquals("Test 15", false, PrimeCheck.isPrime(15));
        assertEquals("Test 16", false, PrimeCheck.isPrime(16));
        assertEquals("Test 18", false, PrimeCheck.isPrime(18));
        assertEquals("Test 20", false, PrimeCheck.isPrime(20));
    }
}