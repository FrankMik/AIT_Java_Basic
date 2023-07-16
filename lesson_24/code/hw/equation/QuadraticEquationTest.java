package hw.equation;

import hw.equation.QuadraticEquation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {

    QuadraticEquation quadraticEquation;

    @BeforeEach
    void setUp() {
        quadraticEquation = new QuadraticEquation();
    }

    @Test
    void equationTest() {
        Double a = 8.;
        Double b = 4.;
        Double с = 2.;
        assertEquals(-1, quadraticEquation.Equation(a, b, с));

    }

    @Test
    void equation2Test() {
        Double a = 5.0;
        Double b = - 7.0;
        Double с = 14.0;
        assertEquals(2, quadraticEquation.Equation2(a, b, с));
    }
}