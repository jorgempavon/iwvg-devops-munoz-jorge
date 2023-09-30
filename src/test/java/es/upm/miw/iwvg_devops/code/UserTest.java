package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class UserTest {

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User("1", "John", "Doe", new ArrayList<>());
    }

    @Test
    public void testFullName() {
        assertEquals("John Doe", user.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("J.", user.initials());
    }

    @Test
    public void testAddFraction() {
        Fraction fraction = new Fraction(1, 2);
        user.addFraction(fraction);

        List<Fraction> fractions = user.getFractions();
        assertEquals(1, fractions.size());
        assertEquals(fraction, fractions.get(0));
    }

    @Test
    public void testSetFractions() {
        List<Fraction> fractions = new ArrayList<>();
        fractions.add(new Fraction(1, 2));
        fractions.add(new Fraction(3, 4));

        user.setFractions(fractions);

        assertEquals(fractions, user.getFractions());
    }



    @Test
    public void testSetAndGetName() {
        user.setName("Alice");
        assertEquals("Alice", user.getName());
    }

    @Test
    public void testSetAndGetFamilyName() {
        user.setFamilyName("Smith");
        assertEquals("Smith", user.getFamilyName());
    }
}
