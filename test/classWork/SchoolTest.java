package classWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
    School school;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        school = new School("mySchool", "34 semicolon way, yaba");
    }

    @Test
    void testThatSchoolNameWasSet() {
        school.setName("mySchool");
        assertEquals("mySchool", school.getName());
    }

    @Test
    void testThatAddressWasSet() {
        school.setAddress("sabo");
        assertEquals("sabo", school.getAddress());

    }

    @Test
    void testThatSchoolCanAddCourse() {
        Courses courses2 = new Courses("biology");
        school.addCourse(courses2);
        assertEquals(courses2, school.getCourse("biology"));
    }
    @Test
    void testThatACourseWasRemoved(){
        Courses courses2 = new Courses("biology");
        school.addCourse(courses2);
        school.removeCourse("biology");
        assertEquals(0, school.listLength);
    }

    @Test
    void testThatStudentWasAdded(){
        Students newStudent1 = new Students("Amos", "Oneh", 23, "male","sabo");
        school.addStudent(newStudent1);
        assertEquals(newStudent1, school.getStudent(102));
    }

    @Test
    void testThatStudentCanBeExpelled() {
        Students student1 = new Students("Jumoke", "IntelliJ", 24, "female", "Juno");
        Students student2 = new Students("tunde", "IntelliJ", 24, "female", "Juno");

        school.addStudent(student1);
        school.addStudent(student2);
        school.expelStudent(101);
        assertEquals(0, school.listLength);
    }
}