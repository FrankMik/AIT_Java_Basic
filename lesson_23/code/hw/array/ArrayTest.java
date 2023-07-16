package hw.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    Array array;

    @BeforeEach
    void setUp() {

        array = new Array();
    }

    @Test
    void zeroCount() {
        int[] arr = {100, 0, -50, 200, 0};
        assertEquals(2, array.zeroCount(arr));
    }

    @Test
    void positiveCount() {
        int[] arr = {100, -10, -50, 200, 0};
        assertEquals(2, array.positiveCount(arr));
    }

    @Test
    void evenCount() {
        int[] arr = {100, -10, 51, 201, 0};
        assertEquals(3, array.evenCount(arr));
    }
}