package hw.prime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPrimeTest {

    IsPrime isPrime;

    @BeforeEach
    void setUp() {

        isPrime = new IsPrime();
    }

    @Test
    void isPrimeNumberTest1() {
        int n = 17;
        assertTrue(isPrime.isPrimeNumber(n));
    }
    @Test
    void isPrimeNumberTest2(){
        int m = 22;
        assertFalse(isPrime.isPrimeNumber(m));
    }
}