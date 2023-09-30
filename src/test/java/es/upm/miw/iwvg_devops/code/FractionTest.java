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


    void testIsProper() {
        Fraction properFraction = new Fraction(2, 3);
        Fraction improperFraction = new Fraction(5, 2);

        assertTrue(properFraction.isProper());
        assertFalse(improperFraction.isProper());
    }

    @Test
    void testIsImproper() {
        Fraction properFraction = new Fraction(2, 3);
        Fraction improperFraction = new Fraction(5, 2);

        assertFalse(properFraction.isImproper());
        assertTrue(improperFraction.isImproper());
    }

    @Test
    void testIsEquivalent() {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(2, 4);
        Fraction fraction3 = new Fraction(3, 5);

        assertTrue(fraction1.isEquivalent(fraction2));
        assertFalse(fraction1.isEquivalent(fraction3));
    }

    @Test
    void testAdd() {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(3, 4);
        Fraction sum = fraction1.add(fraction2);
        assertEquals(10, sum.getNumerator());
        assertEquals(8, sum.getDenominator());
    }

    @Test
    void testMultiply() {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(3, 4);
        Fraction product = fraction1.multiply(fraction2);
        assertEquals(3, product.getNumerator());
        assertEquals(8, product.getDenominator());
    }

    @Test
    void testDivide() {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(3, 4);
        Fraction quotient = fraction1.divide(fraction2);
        assertEquals(4, quotient.getNumerator());
        assertEquals(6, quotient.getDenominator());
    }
}
