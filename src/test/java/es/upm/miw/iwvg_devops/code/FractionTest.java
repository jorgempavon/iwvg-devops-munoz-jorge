package es.upm.miw.iwvg_devops.code;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    public void setUp() {
        fraction = new Fraction(3, 4);
    }

    @Test
    public void testConstructorWithValues() {
        assertEquals(3, fraction.getNumerator());
        assertEquals(4, fraction.getDenominator());
    }

    @Test
    public void testDefaultConstructor() {
        Fraction defaultFraction = new Fraction();
        assertEquals(1, defaultFraction.getNumerator());
        assertEquals(1, defaultFraction.getDenominator());
    }

    @Test
    public void testSetNumerator() {
        fraction.setNumerator(5);
        assertEquals(5, fraction.getNumerator());
    }

    @Test
    public void testSetDenominator() {
        fraction.setDenominator(6);
        assertEquals(6, fraction.getDenominator());
    }

    @Test
    public void testDecimal() {
        double result = fraction.decimal();
        assertEquals(0.75, result, 0.001); // Tolerance of 0.001 for floating-point comparison
    }

    @Test
    public void testToString() {
        assertEquals("Fraction{numerator=3, denominator=4}", fraction.toString());
    }
}
