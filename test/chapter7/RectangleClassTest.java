package chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleClassTest {
    RectangleClass newRec;
    @BeforeEach
    void setUp() {
        newRec = new RectangleClass();
    }

    @Test
    void testPerimeter() {
        double perimeter = newRec.perimeter(10, 6);
        assertEquals(32, perimeter);
    }

    @Test
    void testArea() {
        double area = newRec.area(10, 6);
        assertEquals(60, area);
    }

    @Test
    public void whenExceptionThrown_AssertionSucceeds(){
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> newRec.setLength(150));
        assertEquals("length value is out of range", ex.getMessage());
    }
}