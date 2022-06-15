package classWork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentsTest {
    Students newStudent;
    @BeforeEach
    void setUp() {
        newStudent = new Students("amos", "oneh", 22, "male", "sabo");
        newStudent.resetId();
    }
    @Test
    void testThatFirstNameAndLastNameWasSet(){
        assertEquals("amos", newStudent.getFirstName());
        assertEquals("oneh", newStudent.getLastName());
    }

    @Test
    void testThatAgeAndGenderWasSet(){
        assertEquals(22, newStudent.getAge());
        assertEquals("male", newStudent.getGender());
    }

    @Test
    void testThatAddressWasSet(){
        assertEquals("sabo", newStudent.getAddress());
    }
}